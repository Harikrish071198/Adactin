package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Given("User should be in Login page")
	public void user_should_be_in_login_page() throws IOException {
		try {

			base = new BaseClass();

			base.getDriver("chrome");

			base.LaunchUrl(base.readExcel(0, 1));

			System.out.println("Url_is_successfully_launched");

		} catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		if (pageManager.getLoginpage().getValidateLogin().isDisplayed()) {

			System.out.println("User---is---now---in---LoginPage");

		} else {

			System.out.println("User---is---not--in----LoginPage");
		}
	}

	@When("User should Enter Valid Credentials")
	public void user_should_enter_valid_credentials() throws IOException {
		try {

			WebElement userName = pageManager.getLoginpage().getUserName();
			base.sendKeysByJava(userName, base.readExcel(1, 1));

			WebElement password = pageManager.getLoginpage().getPassword();
			base.sendKeysByJava(password, base.readExcel(2, 1));

		} catch (Exception e)

		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@When("User should Click Login button")
	public void user_should_click_login_button() {

		if (pageManager.getLoginpage().getValidateLogin().isDisplayed()) {

			System.out.println("User---is---now---in---LoginPage");

		} else {

			System.out.println("User---is---not--in----LoginPage");

		}

		WebElement loginButton = pageManager.getLoginpage().getLoginButton();
		base.clickByJava(loginButton);

			}
 
}
