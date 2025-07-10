package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC02_ProductPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Validate Product Page")
	public void user_should_validate_product_page() throws IOException {
		try {
     
			base.sleep(3000);
			if (pageManager.getAddCartPage().getValidateProductPage().isDisplayed()) {
				System.out.println("User____is____in____Product__Page");

				if (pageManager.getAddCartPage().getValidateProductPage().getText().contains("Products")) {
					System.out.println("User___-is_in___Productspage___Aswell");
				}
			} else {
				System.out.println("User_____not_____in____ProductPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@When("User Should Select the Product")
	public void user_should_select_the_product() throws IOException {
		try {
			base.sleep(3000);
			
			WebElement lowToHighPrice = pageManager.getAddCartPage().getLowToHighPrice();
			base.selectByText(lowToHighPrice, "Price (low to high)");

			WebElement backBag = pageManager.getAddCartPage().getBackBag();
			base.clickByJava(backBag);

			WebElement bikeLight = pageManager.getAddCartPage().getBikeLight();
			base.clickByJava(bikeLight);

			WebElement redTshirt = pageManager.getAddCartPage().getRedTshirt();
			base.clickByJS(redTshirt);

			WebElement blackTshirt = pageManager.getAddCartPage().getBlackTshirt();
			base.clickByJava(blackTshirt);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@When("User Should Enter Cart Page")
	public void user_should_enter_cart_page() {

		WebElement addCart = pageManager.getAddCartPage().getAddCart();
		base.clickByJava(addCart);
	}
}
