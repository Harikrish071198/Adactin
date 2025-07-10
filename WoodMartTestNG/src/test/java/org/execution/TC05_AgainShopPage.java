package org.execution;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC05_AgainShopPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority = 9)
	public void ValidateAgainShopPage() {

		if (pageManager.getAgainShopPage().getValidateAgainShopPage().isDisplayed()) {
			System.out.println("User---Now---In---Again---Login---Page");
		} else {
			System.out.println("User---Not----In----Again--Login---Page");
		}

	}

	@Test(priority = 10)
	public void AddProducts() {
		try {

			base.sleep(3000);
			WebElement addToy = pageManager.getAgainShopPage().getAddToy();
			base.clickByJS(addToy);
			base.sleep(3000);

			WebElement closeCartPage = pageManager.getAgainShopPage().getCloseCartPage();
			base.clickByRobot();
			base.sleep(2000);

			WebElement selectDecorationToCart = pageManager.getAgainShopPage().getSelectDecorationToCart();
			base.clickByJS(selectDecorationToCart);
			base.sleep(2000);
			base.sleep(2000);
			WebElement clickCheckPage = pageManager.getAgainShopPage().getClickCheckPage();
			base.clickByJS(clickCheckPage);

		} catch (Exception e) {

		}

	}
}
