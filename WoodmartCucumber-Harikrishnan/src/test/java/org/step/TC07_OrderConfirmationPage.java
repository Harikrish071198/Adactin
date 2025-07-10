package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class TC07_OrderConfirmationPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@Then("User Should Confirm Order and Logout")
	public void user_should_confirm_order_and_logout() throws IOException {
		try {

			if (pageManager.getOrderConfirmation().getValidateConfirmation().isDisplayed()) {
				System.out.println("Order---Confirmed");

			} else {
				System.out.println("Order---Not----Confirmed");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {
			base.sleep(2000);
			WebElement myAccount = pageManager.getOrderConfirmation().getMyAccount();
			base.MouseHover(myAccount);
			base.sleep(2000);
			WebElement clickLogout = pageManager.getOrderConfirmation().getClickLogout();
			base.clickByJava(clickLogout);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
