package com.common;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.util.ConfigPropertiesData;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepDefinitionHelper extends Helper {
	private RequestSpecification requestSpecification; // =
														// getRequestSpecification();
	private HashMap<String, String> configMap;

	public StepDefinitionHelper() throws Exception {
		configMap = ConfigPropertiesData.getConfigProperitesData().getConfigMap();
		this.requestSpecification = RestAssured.with();
	}

	public void configureBaseUri() throws Exception {
		requestSpecification = RestAssured.with();
		requestSpecification.given().contentType(ContentType.JSON).baseUri(configMap.get("baseURI"));
		System.out.println(requestSpecification.toString());
	}

	public Response makeGetCall(String resource) throws Exception {
		return response = requestSpecification.get(resource);
	}

	public Response makeGetCallWithParameters(String resource, List<String> Params) throws Exception {
		response = null;
		response = requestSpecification.params(Params.get(0), Params.get(1)).get(resource);
		return response;

	}

	public Response makeGetCallWithHeadersAndParams(String resource, Map<String, String> headers, List<String> Params) {
		response = null;
		response = requestSpecification.headers(headers).params(Params.get(0), Params.get(1)).get(resource);
		return response;

	}

	public Response makeGetCallWithHeaders(String resource, Map<String, String> headers) throws Exception {
		response = null;
		response = requestSpecification.headers(headers).get(resource);
		return response;
	}

	public Response makePutCall(String resource, Object obj) {

		response = null;
		response = requestSpecification.body(obj).put(resource);
		return response;
	}

	public Response makePutCallWithHeader(String resource, Object obj, Map<String, String> headers) throws Exception {
		response = null;
		response = requestSpecification.body(obj).headers(headers).put(resource);
		return response;

	}

	public Response makePostCall(String resource, Object obj) throws Exception {

		response = null;
		response = requestSpecification.body(obj).post(resource);
		return response;
	}

	public Response makePostCallWithHeader(String resource, Object obj, Map<String, String> headers) throws Exception {

		response = null;
		response = requestSpecification.body(obj).headers(headers).post(resource);
		return response;
	}

	public Response makePostCallWithPathparam(String resource, Object obj, List<String> pathParams) throws Exception {
		response = requestSpecification.pathParam(pathParams.get(0), pathParams.get(1)).body(obj).post(resource);
		return response;
	}

	public ValidatableResponse validateResponseCode(Integer responseCode) throws Exception {
		validatableResponseJson = response.then().statusCode(responseCode);

		return validatableResponseJson;
	}

	public void validateResponsMessage(Map<String, String> responseFields) throws Exception {
		validatableResponseJson.toString();
		if (validatableResponseJson != null) {
			if (!response.getBody().asString().isEmpty()) {
				for (Map.Entry<String, String> field : responseFields.entrySet()) {
					if (StringUtils.isNumeric(field.getValue())) {
						validatableResponseJson.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
					} else {
						if (field.getValue().equals("false")) {
							validatableResponseJson.body(field.getKey(), equalTo(false));
						} else {
							if ("null".equals(field.getValue())) {
								validatableResponseJson.body(field.getKey(), equalTo(null));
							} else if ("true".equals(field.getValue())) {
								validatableResponseJson.body(field.getKey(), equalTo(true));
							} else {
								validatableResponseJson.body(field.getKey(), equalTo(field.getValue()));
							}
						}

					}
				}
			}
		}
	}

	public void verifyResponseFields(List<String> responseFields) {
		if (validatableResponseJson != null) {
			if (!response.getBody().asString().isEmpty()) {
				Iterator<String> i = responseFields.iterator();
				while (i.hasNext()) {
					validatableResponseJson.body(i.next(), is(not(nullValue())));
				}
			}
		}
	}
}
