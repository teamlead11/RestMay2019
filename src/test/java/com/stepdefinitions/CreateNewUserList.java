package com.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.Helper;
import com.common.StepDefinitionHelper;
import com.itextpdf.text.log.SysoCounter;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import requestModel.CreateUserList;

public class CreateNewUserList extends Helper {
	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^the user makes post call to the endpoint \"([^\"]*)\"$")
	public void the_user_makes_post_call_to_the_endpoint(String resource, DataTable userData) throws Throwable {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		CreateUserList obj1 = new CreateUserList();
		List<Map<String, String>> userDataMap = userData.asMaps(String.class, String.class);
		int indId = Integer.parseInt(userDataMap.get(0).get("id"));
		obj1.setId(indId);
		obj1.setUsername(userDataMap.get(0).get("username"));
		obj1.setUsername(userDataMap.get(0).get("fname"));
		obj1.setUsername(userDataMap.get(0).get("lname"));
		obj1.setUsername(userDataMap.get(0).get("email"));
		obj1.setUsername(userDataMap.get(0).get("password"));
		obj1.setUsername(userDataMap.get(0).get("phone"));
		obj1.setUserStatus(Integer.parseInt(userDataMap.get(0).get("userstatus")));

		CreateUserList obj2 = new CreateUserList();
		obj2.setId(Integer.parseInt(userDataMap.get(1).get("id")));
		obj2.setUsername(userDataMap.get(1).get("username"));
		obj2.setUsername(userDataMap.get(1).get("fname"));
		obj2.setUsername(userDataMap.get(1).get("lname"));
		obj2.setUsername(userDataMap.get(1).get("email"));
		obj2.setUsername(userDataMap.get(1).get("password"));
		obj2.setUsername(userDataMap.get(1).get("phone"));
		obj2.setUserStatus(Integer.parseInt(userDataMap.get(1).get("userstatus")));

		List<CreateUserList> list = new ArrayList<CreateUserList>();
		list.add(obj1);
		list.add(obj2);

		response = commonCode.makePostCallWithHeader(resource, list, headers);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().prettyPrint());
	}
}
