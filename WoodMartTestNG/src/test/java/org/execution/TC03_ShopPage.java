package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03_ShopPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority = 5)
	public void ValidateShopPage() throws IOException {
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

	}

	@Test(priority = 6)
	public void BuyWatch() throws IOException {
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
