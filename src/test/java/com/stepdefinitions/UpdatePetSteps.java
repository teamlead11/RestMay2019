package com.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.common.Helper;
import com.common.StepDefinitionHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import requestModel.Category;
import requestModel.NewPetRequest;
import requestModel.Tags;

public class UpdatePetSteps extends Helper {

	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes the put call to the resource \"([^\"]*)\"$")
	public void the_user_makes_the_put_call_to_the_resource(String resource, DataTable petDetails) throws Throwable {

		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		response = null;
		Map<String, String> petDetailsMap = petDetails.asMap(String.class, String.class);
		NewPetRequest newPet = new NewPetRequest();
		newPet.setId(Long.parseLong(petDetailsMap.get("id")));
		newPet.setName(petDetailsMap.get("name"));
		newPet.setStatus(petDetailsMap.get("status"));

		Category cats = new Category();
		cats.setId(Long.parseLong(petDetailsMap.get("id")));
		cats.setName(petDetailsMap.get("catName"));
		newPet.setCategory(cats);

		List<String> urlList = new ArrayList<String>();
		urlList.add(petDetailsMap.get("photoUrl"));

		newPet.setPhotoUrls(urlList);

		Tags tag = new Tags();
		tag.setId(Long.parseLong(petDetailsMap.get("id")));
		tag.setName(petDetailsMap.get("tagname"));
		List<Tags> tagList = new ArrayList<Tags>();
		tagList.add(tag);

		newPet.setTags(tagList);

		response = commonCode.makePutCall(resource, newPet);

	}

	@Then("^The user validates the updated pet details$")
	public void the_user_validates_the_updated_pet_details(DataTable details) throws Throwable {

		Map<String, String> myMap = details.asMap(String.class, String.class);
		NewPetRequest outrespJava = response.as(NewPetRequest.class);
		Assert.assertEquals(myMap.get("name"), outrespJava.getName());
		Assert.assertEquals(myMap.get("name"), outrespJava.getId());
	}
}
