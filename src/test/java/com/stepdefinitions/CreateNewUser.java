package com.stepdefinitions;

import java.util.HashMap;
import org.junit.Assert;
import com.common.Helper;
import com.common.StepDefinitionHelper;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import requestModel.CreateUser;

public class CreateNewUser extends Helper {
	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes the post call for the endpoint \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_makes_the_post_call_for_the_endpoint_with(String endpoint, String id, String user,
			String firstname, String lastname, String email, String pass, String phone, String status)
			throws Throwable {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		CreateUser createUser = new CreateUser();
		createUser.setId(Integer.parseInt(id));
		createUser.setUsername(user);
		createUser.setFirstName(firstname);
		createUser.setLastName(lastname);
		createUser.setPassword(pass);
		createUser.setPhone(Long.parseLong(phone));
		createUser.setEmail(email);
		createUser.setUserStatus(Integer.parseInt(status));
		response = null;
		response = commonCode.makePostCallWithHeader(endpoint, createUser, headers);
	}

	@Then("^The user validates the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_validates_the(String id, String user, String firstname, String lastname, String email,
			String pass, String phone, String status) throws Throwable {
		CreateUser create = response.as(CreateUser.class);
		Assert.assertEquals(Integer.parseInt(id), create.getId());
	}
}
