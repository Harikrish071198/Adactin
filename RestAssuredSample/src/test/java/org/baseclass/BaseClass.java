package org.baseclass;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static RequestSpecification requestSpecification;

	public static Response response;

//Request Object
	public static void requestObject(String baseURI) {

		RestAssured.baseURI = baseURI;

		requestSpecification = RestAssured.given();

	}

	// Query Parameter
	public static void queryParameter(String parameterName, String parameterValues) {
		requestSpecification.queryParam(parameterName, parameterValues);
	}

	// path parameter
	public static void pathParameter(String parameterName, String parameterValue) {
		requestSpecification.pathParam(parameterName, parameterValue);
	}

	// payload
	public static void payLoad(JSONObject jsonObject) {
		requestSpecification.body(jsonObject.toJSONString());

	}

	// Response Object
	public static void responseObject(String requestType, String endPoint) {

		switch (requestType) {
		case "GET": {
			response = requestSpecification.request(Method.GET, endPoint);
			break;
		}

		case "POST": {

			response = requestSpecification.request(Method.POST, endPoint);
			break;
		}

		case "PUT": {
			response = requestSpecification.request(Method.PUT, endPoint);
			break;
		}
		default: {
			response = requestSpecification.request(Method.DELETE, endPoint);
			break;
		}
		}

	}

	// Response Code
	public static void responseCode() {

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

	}

   //Response Body
	public static void responseBody() {
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}
	
	//Read Data from Excel
	public static void readDataFromExcel(int rownum,int cellnum) {
		
	}
	
}
