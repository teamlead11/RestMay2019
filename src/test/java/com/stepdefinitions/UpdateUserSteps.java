package com.stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.common.Helper;
import com.common.StepDefinitionHelper;
import com.itextpdf.text.log.SysoCounter;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import requestModel.Newuser;

public class UpdateUserSteps extends Helper {
	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes the put call to the resource to update user \"([^\"]*)\"$")
	public void the_user_makes_the_put_call_to_the_resource_to_update_user(String resource, DataTable userDetails)
			throws Throwable {
		List<String> userDetailsList = userDetails.asList(String.class);
		Newuser user1 = new Newuser();
		user1.setId(Integer.parseInt(userDetailsList.get(0)));
		user1.setUsername(userDetailsList.get(1));
		user1.setFirstName(userDetailsList.get(2));
		user1.setLastName(userDetailsList.get(3));
		user1.setEmail(userDetailsList.get(4));
		user1.setPassword(userDetailsList.get(5));
		user1.setPhone(userDetailsList.get(6));
		user1.setUserStatus(Integer.parseInt(userDetailsList.get(7)));

		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");

		response = commonCode.makePutCallWithHeader(resource, user1, headers);
	}

	@Then("^The user should see the updated values$")
	public void the_user_should_see_the_updated_values(DataTable userDetails) throws Throwable {
		commonCode.configureBaseUri();
		response = commonCode.makeGetCall("user/gopiselenium");
		System.out.println(response.prettyPrint());
		List<String> userDetailsList = userDetails.asList(String.class);
		Newuser usern = response.as(Newuser.class);
		Assert.assertEquals(Integer.parseInt(userDetailsList.get(0)), usern.getId());
		Assert.assertEquals(userDetailsList.get(1), usern.getUsername());

	}
}
