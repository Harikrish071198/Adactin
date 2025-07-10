package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class TC07_AdactinAgainLogin extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@Then("User Should Again Login")
	public void user_should_again_login() throws IOException, InterruptedException {

		try {
			WebElement loginagain = pagemanager.getLoginagain().getLoginagain();
			base.clickByJS(loginagain);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
			base.sleep(5000);
		}
		try {
			if (pagemanager.getLoginagain().getValidateloginagain().isDisplayed()) {
				System.out.println("User_is _now_in_again_login_Page");
			} else {
				System.out.println("User_is_not_in_again_login_page");
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}

	}
}
