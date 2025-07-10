package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02_MyAccountPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority = 3)

	public void ValidateMyAccountPage() {

		if (pageManager.getMyAccountPage().getValidateMyAccountPage().isDisplayed()) {
			System.out.println("User---Now--In----MyAccountyPage");

		}

		else {
			System.out.println(("User---Not---In----MyAccountPage"));
		}
	}

	@Test(priority = 4)
	public void ToEnterShop() throws IOException {
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
