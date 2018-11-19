package com.stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.Helper;
import com.common.StepDefinitionHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import requestModel.Newuser;

public class CreateNewUserSteps extends Helper {

	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes POST call for the endpoint \"([^\"]*)\"$")
	public void the_user_makes_POST_call_for_the_endpoint(String resource, DataTable userData) throws Throwable {
		List<List<String>> dataList = userData.asLists(String.class);
		Newuser user = new Newuser();
		int id = Integer.parseInt(dataList.get(1).get(0));

		user.setId(id);
		user.setUsername(dataList.get(1).get(1));
		user.setFirstName(dataList.get(1).get(2));
		user.setLastName(dataList.get(1).get(3));
		user.setEmail(dataList.get(1).get(5));
		user.setPassword(dataList.get(1).get(6));
		user.setPhone(dataList.get(1).get(4));
		int status = Integer.parseInt(dataList.get(1).get(7));
		user.setUserStatus(status);

		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		response = null;
		response = commonCode.makePostCallWithHeader(resource, user, headers);
		System.out.println(response.prettyPrint());
	}
}
