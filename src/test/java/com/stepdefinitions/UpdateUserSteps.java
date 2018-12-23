package com.stepdefinitions;

import java.util.HashMap;
import java.util.List;

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
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		List<String> userDetailsList = userDetails.asList(String.class);
		Newuser usernew = new Newuser();
		usernew.setId(Integer.parseInt(userDetailsList.get(0)));
		usernew.setUsername(userDetailsList.get(1));
		usernew.setFirstName(userDetailsList.get(2));
		usernew.setLastName(userDetailsList.get(3));
		usernew.setEmail(userDetailsList.get(4));
		usernew.setPassword(userDetailsList.get(5));
		usernew.setPhone(userDetailsList.get(6));
		usernew.setUserStatus(Integer.parseInt(userDetailsList.get(7)));
		response = null;
		response = commonCode.makePutCallWithHeader(resource, usernew, headers);
		System.out.println(response.prettyPrint());
	}

	@Then("^The user validates the modified data$")
	public void the_user_validates_the_modified_data(DataTable userDetails) throws Throwable {

		Newuser user = response.as(Newuser.class);
		
		List<String> userDetailsList = userDetails.asList(String.class);
		Assert.assertEquals(Integer.parseInt(userDetailsList.get(0)), user.getId());
		Assert.assertEquals(userDetailsList.get(1), user.getUsername());
		Assert.assertEquals(userDetailsList.get(2), user.getFirstName());
		Assert.assertEquals(userDetailsList.get(3), user.getLastName());
		Assert.assertEquals(userDetailsList.get(4), user.getEmail());
		Assert.assertEquals(userDetailsList.get(5), user.getPassword());
		Assert.assertEquals(userDetailsList.get(6), user.getPhone());
		Assert.assertEquals(Integer.parseInt(userDetailsList.get(7)), user.getUserStatus());
	}
}
