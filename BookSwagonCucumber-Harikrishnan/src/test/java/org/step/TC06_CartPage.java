package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC06_CartPage extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should Enter Cart Page")
	public void user_should_enter_cart_page() throws IOException {
		try {

			base.sleep(3000);
			if (pageManager.getCartpage().getValidateCartPage().isDisplayed()) {
				System.out.println("User----in----CartPage");
			}
			if (pageManager.getCartpage().getValidateCartPage().getText().contains("My Shopping Cart")) {
				System.out.println("User--is--in---CartPage--AsWell");
				base.sleep(3000);
				WebElement clickBuy = pageManager.getCartpage().getClickBuy();
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
