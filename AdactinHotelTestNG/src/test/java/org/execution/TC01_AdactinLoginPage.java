package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC01_AdactinLoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pagemanager = new PageManager();

	@Test(priority=1)
	public static void Browserlaunch() throws IOException {

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

	@Test(priority=2)
	public void ValidateLoginPage() {

		try {

			WebElement username = pagemanager.getLoginpage().getUsername();
			base.sendKeysJS(username, base.readExcel(2, 1));

			WebElement password = pagemanager.getLoginpage().getPassword();
			base.sendKeysJS(password, base.readExcel(3, 1));

			WebElement login = pagemanager.getLoginpage().getLogin();
			base.clickByJava(login);

			WebElement validateLoginPage = pagemanager.getLoginpage().getValidateLoginPage();
			System.out.println("User_is_in_loginpage");

		} catch (Exception e) {

		}
	}
}
 
 