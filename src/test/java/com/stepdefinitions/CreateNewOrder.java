package com.stepdefinitions;

import java.util.HashMap;

import org.junit.Assert;

import com.common.Helper;
import com.common.StepDefinitionHelper;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import requestModel.CreateOrderRequest;

public class CreateNewOrder extends Helper {

	private StepDefinitionHelper commonCode = getStepDefinitionHelper();

	@When("^The user makes the post call to the endpoint \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_makes_the_post_call_to_the_endpoint_with_and(String endPoint, String id, String petId,
			String quant, String shipdate, String status, String complete) throws Throwable {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		CreateOrderRequest createOrder = new CreateOrderRequest();
		createOrder.setId(Integer.parseInt(id));
		createOrder.setPetId(Long.parseLong(petId));
		createOrder.setQuantity(Integer.parseInt(quant));
		createOrder.setComplete(Boolean.parseBoolean(complete));
		createOrder.setShipDate(shipdate);
		createOrder.setStatus(status);
		response = null;
		response = commonCode.makePostCallWithHeader(endPoint, createOrder, headers);
	}

	@Then("^The user validates the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_validates_the_and(String id, String petID, String quantity, String shipdate, String status,
			String complete) throws Throwable {
		CreateOrderRequest order = response.as(CreateOrderRequest.class);
		Assert.assertEquals(Integer.parseInt(id), order.getId());
	}
}
