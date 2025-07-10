package org.demo;

import org.baseclass.BaseClass;
import org.testng.annotations.BeforeMethod;

public class Sample1 extends BaseClass{

	@BeforeMethod
	private void beforeMethod() {
		requestObject("https://reqres.in/");
	}
}
