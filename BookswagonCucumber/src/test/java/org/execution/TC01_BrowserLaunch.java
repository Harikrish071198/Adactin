package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC01_BrowserLaunch extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Test(priority = 1)
	public void LaunchBrowser() throws IOException {
		try {
			base = new BaseClass();
			base.getDriver(base.readExcel(0, 1));
			base.LaunchUrl(base.readExcel(3, 1));
			base.winMax();

			WebElement loginPage = pageMangaer.getBrowserLaunch().getLoginPage();
			base.MouseHover(loginPage);

			WebElement loginButton = pageMangaer.getBrowserLaunch().getLoginButton();
			base.ClickByActions(loginButton);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@Test(priority = 2)
	public void ValidateLoginPage() throws IOException {
		try {

			if (pageMangaer.getBrowserLaunch().getValidateBrowserLaunch().isDisplayed()) {

				System.out.println("User----Logged--In------Successfully");

			} else {
				System.out.println("User---Not---logged--In");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
