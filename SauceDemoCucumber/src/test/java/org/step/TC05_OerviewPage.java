package org.step;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC05_OerviewPage extends BaseClass{

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();
	
	
	@When("User Should Click Finish button")
	public void user_should_click_finish_button() {
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
	}
}
