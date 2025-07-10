package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Given("User Should be in Login Page")
	public void user_should_be_in_login_page() throws IOException {
		try {

			base.getDriver(base.readExcel(2, 1));

			base.LaunchUrl(base.readExcel(3, 1));

			base.winMax();

			base.sleep(1000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@When("User Should Validate Login Succesfull")
	public void user_should_validate_login_succesfull() throws InterruptedException {

		if (pageManager.getLoginPage().getValidateLogiPage().isDisplayed()) {
			System.out.println("User---Now---In---LoginPage");

			if (pageManager.getLoginPage().getValidateLogiPage().getText().contains("Login")) {
				System.out.println("User--Now---In---Login--Page--AsWell");
			}
		} else {
			System.out.println("User---Not---In----LoginPage");
		}
	}

	@When("User Should Enter valid Credentials")
	public void user_should_enter_valid_credentials() throws IOException {
		try {

			WebElement userName = pageManager.getLoginPage().getUserName();
			base.sendKeysJS(userName, base.readExcel(0, 1));

			WebElement password = pageManager.getLoginPage().getPassword();
			base.sendKeysJS(password, base.readExcel(1, 1));

			WebElement loginButton = pageManager.getLoginPage().getLoginButton();
			base.ClickByActions(loginButton);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
