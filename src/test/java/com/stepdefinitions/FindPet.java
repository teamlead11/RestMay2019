package com.stepdefinitions;

import java.util.HashMap;

import org.junit.Assert;

import com.common.Helper;
import com.common.StepDefinitionHelper;
import com.itextpdf.text.log.SysoCounter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import requestModel.PetModel;

public class FindPet extends Helper {

	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes a GET call to the resource \"([^\"]*)\"$")
	public void the_user_makes_a_GET_call_to_the_resource(String resource) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		response = commonCode.makeGetCallWithHeaders(resource, headers);
	}

	@Then("^The user validates the response body$")
	public void the_user_validates_the_response_body() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PetModel objpet = response.as(PetModel.class);
		System.out.println(objpet.getName());
		Assert.assertEquals("valueimplcat", objpet.getName());
	}
}
