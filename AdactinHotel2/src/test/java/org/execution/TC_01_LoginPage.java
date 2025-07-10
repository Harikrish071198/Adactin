package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_01_LoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pagemanager = new PageManager();

	@Given("User Should be in Login Page")
	public void user_should_be_in_login_page() throws IOException {

		base = new BaseClass();

		base.getDriver(base.readExcel(0, 1));
		base.LaunchURL(base.readExcel(3, 1));
		base.windowsMax();
		
		System.out.println("Browser launched");
	}

	@When("User Should Enter Valid Credentials")
	public void user_should_enter_valid_credentials() throws IOException, InterruptedException {

		Thread.sleep(2000);
		
		WebElement username = pagemanager.getLoginpage().getUsername();
		base.sendKeysByJava(username, base.readExcel(1, 1));
		
		Thread.sleep(2000);

		WebElement password = pagemanager.getLoginpage().getPassword();
		base.sendKeysByJava(password, base.readExcel(2, 1));

		Thread.sleep(2000);
		
		WebElement login = pagemanager.getLoginpage().getLogin();
		base.clickByJS(login);

		WebElement validateloginpage = pagemanager.getLoginpage().getValidateloginpage();
		System.out.println("User is in Login page");
	}

}
