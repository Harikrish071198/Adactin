package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02_ProductPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority=4)

	public void ValidateProductPage() throws IOException {
		try {

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

	@Test(priority=5)
	public void ProductSelection() throws IOException {
		try {

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

			WebElement addCart = pageManager.getAddCartPage().getAddCart();
			base.clickByJava(addCart);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

}