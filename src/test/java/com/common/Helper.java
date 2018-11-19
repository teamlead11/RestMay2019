package com.common;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Helper {
	protected static Response response;
	private static StepDefinitionHelper commonCode;
	protected static ValidatableResponse validatableResponseJson;

	protected static int statusCode;

	protected StepDefinitionHelper getStepDefinitionHelper() {
		if (commonCode == null) {
			try {
				commonCode = new StepDefinitionHelper();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return commonCode;
	}

}
