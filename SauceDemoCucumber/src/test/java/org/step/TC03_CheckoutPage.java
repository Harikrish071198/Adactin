package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC03_CheckoutPage extends BaseClass{

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();
	

	@When("User Should Enter Checkout Page")
	public void user_should_enter_checkout_page() throws IOException {
		try {
			if (pageManager.getCheckOutPage().getValidateCheckout().isDisplayed()) {
				System.out.println("User---Now---in---Checkout---page");
			} else {
				System.out.println("User---not--in----Checkout---page");
			}

			WebElement checkout = pageManager.getCheckOutPage().getCheckout();
			base.clickByJava(checkout);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	
	
}
