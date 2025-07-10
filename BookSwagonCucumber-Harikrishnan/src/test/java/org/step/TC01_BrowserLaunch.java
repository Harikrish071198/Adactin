package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_BrowserLaunch extends BaseClass{
  
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	
	@Given("User Should be in Login  Page")
	public void user_should_be_in_login_page() throws IOException {
		try {
			base = new BaseClass();
			base.getDriver(base.readExcel(0, 1));
			base.LaunchUrl(base.readExcel(3, 1));
			base.winMax();

			WebElement loginPage = pageManager.getBrowserLaunch().getLoginPage();
			base.MouseHover(loginPage);

			WebElement loginButton = pageManager.getBrowserLaunch().getLoginButton();
			base.ClickByActions(loginButton);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		
		try {

			if (pageManager.getBrowserLaunch().getValidateBrowserLaunch().isDisplayed()) {

				System.out.println("User----Logged--In------Successfully");

			} else {
				System.out.println("User---Not---logged--In");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

		
		
		try {
			if (pageManager.getLoginPage().getValidateLoginPage().isDisplayed()) {
				System.out.println("User----is---Now----in----Loginpage");

				if (pageManager.getLoginPage().getValidateLoginPage().getText().contains("Login")) {
					System.out.println("User---is---Loginpage---AsWell");
				}
			} else {
				System.out.println("User----is---Not----in----Loginpage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

}
