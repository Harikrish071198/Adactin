package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC02_MyAccountPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Enter Shopping Page")
	public void user_should_enter_shopping_page() throws IOException {

		if (pageManager.getMyAccountPage().getValidateMyAccountPage().isDisplayed()) {
			System.out.println("User---Now--In----MyAccountyPage");

		}

		else {
			System.out.println(("User---Not---In----MyAccountPage"));
		}
		try {

			WebElement enterShop = pageManager.getMyAccountPage().getEnterShop();
			base.sleep(4000);
			base.MouseHover(enterShop);
			base.sleep(3000);

			WebElement selectProductView = pageManager.getMyAccountPage().getSelectProductView();
			base.clickByJS(selectProductView);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
