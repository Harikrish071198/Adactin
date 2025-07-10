package org.step;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC05_AgainShopPage extends BaseClass{
	
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should Comeback To Shop Page")
	public void user_should_comeback_to_shop_page() {

		if (pageManager.getAgainShopPage().getValidateAgainShopPage().isDisplayed()) {
			System.out.println("User---Now---In---Again---Login---Page");
		} else {
			System.out.println("User---Not----In----Again--Login---Page");
		}
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
