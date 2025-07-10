package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC06_CheckoutPage extends BaseClass{
	
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should Enter Checkout Page")
	public void user_should_enter_checkout_page() throws IOException {
		try {
			base.sleep(3000);
			WebElement closeTab = pageManager.getCheckOutPage().getCloseTab();
			base.ClickByActions(closeTab);

			if (pageManager.getCheckOutPage().getValidateCheckoutpage().isDisplayed()) {
				System.out.println("User---Now---In---CheckOutPage");
			} else {
				System.out.println("User---Not---In---CheckoutPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {

			base.sleep(2000);
			WebElement clickTerms = pageManager.getCheckOutPage().getClickTerms();
			base.ClickByActions(clickTerms);
			base.sleep(2000);
			WebElement clickPlaceOrder = pageManager.getCheckOutPage().getClickPlaceOrder();
			base.ClickByActions(clickPlaceOrder);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
