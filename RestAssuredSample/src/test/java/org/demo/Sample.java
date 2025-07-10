package org.demo;

import org.baseclass.BaseClass;
import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.path.json.mapper.factory.JsonbObjectMapperFactory;

public class Sample extends BaseClass{

	@BeforeMethod
	private void beforeMethod() {
		requestObject("https://reqres.in/");
	}
	@Test
	private void tc0() {
		queryParameter("page", "2");
		responseObject("GET", "/api/users");

	}
	@Test
	private void tc01() {
		pathParameter("id", "2");
		responseObject("GET", "/api/users/{id}");
	}
	@AfterMethod
	private void afterMethod() {
		responseCode();
		responseBody();

	}
	@Test
	private void tc2() {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name","Ram Sarath");
		jsonObject.put("job", "QA");
		payLoad(jsonObject);
		responseObject("POST", "api/users");

	}
	@Test
	private void tc3() {
	
	JSONObject jsonObject=new JSONObject();
	jsonObject.put("name", "Ram Sarath");
	jsonObject.put("job", "Trainer");
	payLoad(jsonObject);
	pathParameter("id", "2");
	responseObject("PUT", "api/users/{id}");
	}	
	@Test
	private void tc4() {
		pathParameter("id", "2");
responseObject("DELETE", "api/users/{id}");
	}
	@Test
	private void tc5() {
		pathParameter("id", "2");
		responseObject("GET", "/api/users/2{id}");

	}
}
