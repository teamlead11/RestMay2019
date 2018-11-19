package com.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.Helper;
import com.common.StepDefinitionHelper;
import com.itextpdf.text.log.SysoCounter;

import cucumber.api.java.en.When;
import requestModel.Category;
import requestModel.NewPetRequest;
import requestModel.Tags;

public class Createnewpetsteps extends Helper {
	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^user make GET call on the pet status endpoint for available pets \"([^\"]*)\"$")
	public void i_make_GET_call_on_the_create_pet_endpoint(String resource) throws Exception {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		response = null;
		response = commonCode.makeGetCallWithHeaders(resource, headers);
		response.prettyPrint();
		NewPetRequest test = response.as(NewPetRequest.class);
		System.out.println(test.getName()+"test");
	}

	@When("^user make POST call on the pet status endpoint for available pets \"([^\"]*)\"$")
	public void i_make_POST_call_on_the_pet_status_endpoint_for_available_pets(String resource) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		response = null;
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Category cats = new Category();
		cats.setId(2);
		cats.setName("tommy");

		Tags tag1 = new Tags();
		tag1.setId(2);
		tag1.setName("tommy");

		Tags tag2 = new Tags();
		tag2.setId(3);
		tag2.setName("tommy2");

		NewPetRequest newpetobj = new NewPetRequest();
		newpetobj.setId(2);
		newpetobj.setName("tommy");
		newpetobj.setStatus("available");
		newpetobj.setCategory(cats);

		List<String> phturl = new ArrayList<String>();
		phturl.add("url1");
		phturl.add("url2");

		List<Tags> taglist = new ArrayList<Tags>();
		taglist.add(tag1);
		taglist.add(tag2);

		newpetobj.setPhotoUrls(phturl);
		newpetobj.setTags(taglist);

		response = commonCode.makePostCallWithHeader(resource, newpetobj, headers);
		NewPetRequest test = response.as(NewPetRequest.class);
		System.out.println(test.getName()+"test");

	}

	@When("^user make PUT call on the pet status endpoint for available pets \"([^\"]*)\"$")
	public void user_make_PUT_call_on_the_pet_status_endpoint_for_available_pets(String resource) throws Throwable {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Category cats = new Category();
		cats.setId(4);
		cats.setName("tommyPut");

		Tags tag1 = new Tags();
		tag1.setId(4);
		tag1.setName("tommyPut");

		Tags tag2 = new Tags();
		tag2.setId(5);
		tag2.setName("tommy2Put");

		NewPetRequest newpetobj = new NewPetRequest();
		newpetobj.setId(4);
		newpetobj.setName("tommyPut");
		newpetobj.setStatus("available");
		newpetobj.setCategory(cats);

		List<String> phturl = new ArrayList<String>();
		phturl.add("url1Put");
		phturl.add("url2Put");

		List<Tags> taglist = new ArrayList<Tags>();
		taglist.add(tag1);
		taglist.add(tag2);

		newpetobj.setPhotoUrls(phturl);
		newpetobj.setTags(taglist);

		response = commonCode.makePutCallWithHeader(resource, newpetobj, headers);
		NewPetRequest test = response.as(NewPetRequest.class);
		System.out.println(test.getName()+"test");
	}

}
