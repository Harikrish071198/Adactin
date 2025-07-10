package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC01_LoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Before
	public void ValidateLoginPage() throws IOException {
		try {

			base.getDriver(base.readExcel(2, 1));

			base.LaunchUrl(base.readExcel(3, 1));

			base.winMax();

			base.sleep(1000);

			if (pageManager.getLoginPage().getValidateLogiPage().isDisplayed()) {
				System.out.println("User---Now---In---LoginPage");

				if (pageManager.getLoginPage().getValidateLogiPage().getText().contains("Login")) {
					System.out.println("User--Now---In---Login--Page--AsWell");
				}
			} else {
				System.out.println("User---Not---In----LoginPage");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@Test
	public void EnterCredentials() throws IOException {
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
