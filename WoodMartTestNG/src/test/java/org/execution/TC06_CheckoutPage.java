package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC06_CheckoutPage extends BaseClass {
	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority=11)
	public void ValidateCheckoutPage() throws IOException {
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

	}

	@Test(priority=12)
	public void EnterDetails() throws IOException, InterruptedException {
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
