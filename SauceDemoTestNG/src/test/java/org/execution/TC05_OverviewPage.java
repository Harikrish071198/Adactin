package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC05_OverviewPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority = 10)
	public void OrderConfirmation() throws IOException {
		try {
			if (pageManager.getOverviewPage().getCheckoutOverview().isDisplayed()) {
				System.out.println("User----is----in----OrderConfirmation----Page");

				if (pageManager.getOverviewPage().getCheckoutOverview().getText().contains("Checkout: Overview")) {
					System.out.println("User___is__in__Checkout: Overview__Page");
				}

				WebElement finishButton = pageManager.getOverviewPage().getFinishButton();
				base.clickByJava(finishButton);

			} else {
				System.out.println("User----is----not----in----OrderConfirmation---Page");
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
