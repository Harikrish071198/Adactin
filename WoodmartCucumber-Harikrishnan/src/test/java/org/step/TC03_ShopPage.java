package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC03_ShopPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should click Watch to Buy")
	public void user_should_click_watch_to_buy() throws IOException {
		try {
			if (pageManager.getShopPage().getValidateShopPage().isDisplayed()) {
				System.out.println("User---Is---In----ShopPage");
			} else {
				System.out.println("User---Not----In---ShopPage");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {
			base.sleep(2000);
			WebElement selectWatch = pageManager.getShopPage().getSelectWatch();
			base.ClickByActions(selectWatch);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
