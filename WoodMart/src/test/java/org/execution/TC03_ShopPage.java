package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC03_ShopPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Before
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

	@Test
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
