package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class TC08_AgainLoginPage extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@Then("User Should be back to LoginPage and Logout")
	public void user_should_be_back_to_login_page_and_logout() throws IOException {
	   
		try {
			if (pageManager.getAgainLoginPage().getValidateReviewOrder().isDisplayed()) {
				System.out.println("User---In---Review--Order---Page");

				WebElement backToHomePage = pageManager.getAgainLoginPage().getBackToHomePage();
				base.ClickByActions(backToHomePage);

				WebElement getclickMyAcc = pageManager.getAgainLoginPage().getclickMyAcc();
				base.MouseHover(getclickMyAcc);

				WebElement clickLogOut = pageManager.getAgainLoginPage().getClickLogOut();
				base.ClickByActions(clickLogOut);
			} else {
				System.out.println("User----Not----In---Review----order---Page");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}
	}
}
