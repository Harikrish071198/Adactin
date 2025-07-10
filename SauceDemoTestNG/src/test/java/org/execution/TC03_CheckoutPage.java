package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03_CheckoutPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority=6)
	public void Validate_Check_Out() throws IOException {
		try {

			if (pageManager.getCheckOutPage().getValidateCheckout().isDisplayed()) {
				System.out.println("User---Now---in---Checkout---page");
			} else {
				System.out.println("User---not--in----Checkout---page");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test(priority=7)
	public void Checkout() {
		try {

			WebElement checkout = pageManager.getCheckOutPage().getCheckout();
			base.clickByJava(checkout);

		} catch (Exception e) {

		}
	}
}
