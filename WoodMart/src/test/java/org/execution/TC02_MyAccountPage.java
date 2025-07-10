package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC02_MyAccountPage extends BaseClass{


	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Before
	
	public void ValidateMyAccountPage() {
		
		if(pageManager.getMyAccountPage().getValidateMyAccountPage().isDisplayed()) {
			System.out.println("User---Now--In----MyAccountyPage");
		
		}
	
		else {
			System.out.println(("User---Not---In----MyAccountPage"));
		}
	}

	@Test
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
