package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class TC01_SauceLoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@BeforeClass
	public static void Browser() throws IOException {

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
	}

	@Before
	public void Validate_Credentials() throws IOException, InterruptedException {

		try {
			if (pageManager.getLoginpage().getValidateLogin().isDisplayed()) {

				System.out.println("User---is---now---in---LoginPage");

			} else {

				System.out.println("User---is---not--in----LoginPage");
			}
		} catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();

		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
			base.sleep(5000);
		}

	}

	@Test
	public void LoginCredentials() throws IOException {
		try {

			WebElement userName = pageManager.getLoginpage().getUserName();
			base.sendKeysByJava(userName, base.readExcel(1, 1));

			WebElement password = pageManager.getLoginpage().getPassword();
			base.sendKeysByJava(password, base.readExcel(2, 1));

			WebElement loginButton = pageManager.getLoginpage().getLoginButton();
			base.clickByJava(loginButton);

		} catch (Exception e)

		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
