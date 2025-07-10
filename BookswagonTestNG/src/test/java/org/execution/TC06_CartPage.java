package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TC06_CartPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Test(priority = 10)
	public void CartPage() throws IOException {
		try {

			base.sleep(3000);
			if (pageMangaer.getCartpage().getValidateCartPage().isDisplayed()) {
				System.out.println("User----in----CartPage");
			}
			if (pageMangaer.getCartpage().getValidateCartPage().getText().contains("My Shopping Cart")) {
				System.out.println("User--is--in---CartPage--AsWell");
				base.sleep(3000);
				WebElement clickBuy = pageMangaer.getCartpage().getClickBuy();
				base.ClickByActions(clickBuy);

			} else {
				System.out.println("User--is---not--in---CartPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
