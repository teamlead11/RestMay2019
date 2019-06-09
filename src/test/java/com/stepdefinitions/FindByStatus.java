package com.stepdefinitions;

import org.junit.Assert;

import com.common.Helper;
import com.common.StepDefinitionHelper;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import requestModel.PetModel;

public class FindByStatus extends Helper {

	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes a get call to the resource \"([^\"]*)\" to find the sold status$")
	public void the_user_makes_a_get_call_to_the_resource_to_find_the_status(String resource) throws Throwable {
		response = commonCode.makeGetCall(resource);
		System.out.println("when"+ resource);
	}

	@Then("^The user should see only the sold pet in the response$")
	public void the_user_should_see_only_the_sold_pet_in_the_response() throws Throwable {
		PetModel[] pet = response.as(PetModel[].class);
		
		for(int i=0;i<pet.length;i++) {
			Assert.assertEquals("sold", pet[i].getStatus());
			System.out.println(pet[i].getStatus());
		}
		
	}
}
