package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_AdactinLoginPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@Given("User Should be in Login Page")
	public void user_should_be_in_login_page() throws IOException {
		try {

			base = new BaseClass();

			base.getDriver(base.readExcel(0, 1));

			base.LaunchUrl(base.readExcel(1, 1));

			base.winMax();

			System.out.println("_Browser Launched _URL Launched_");

		} catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();
		} catch (IOException e) {
			System.out.println("Check data acess version" + e.getMessage());
			base.screenCapture();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User Should Enter Valid Credentials")
	public void user_should_enter_valid_credentials() throws IOException {
		WebElement username = pagemanager.getLoginpage().getUsername();
		base.sendKeysJS(username, base.readExcel(2, 1));

		WebElement password = pagemanager.getLoginpage().getPassword();
		base.sendKeysJS(password, base.readExcel(3, 1));

	}

	@When("User Should Login button")
	public void user_should_login_button() {
		WebElement login = pagemanager.getLoginpage().getLogin();
		base.clickByJava(login);
	}

	@When("User Should Validate Login successfull")
	public void user_should_validate_login_successfull() {
		WebElement validateLoginPage = pagemanager.getLoginpage().getValidateLoginPage();
		System.out.println("User_is_in_loginpage");

	}

}
