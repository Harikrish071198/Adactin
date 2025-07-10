package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC04_SmartWatchPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Before
	public void ValidateSmartWatchPage() throws IOException {
		try {
			base.sleep(2000);
			if (pageManager.getSmartWatchPage().getValidateSmartWatchPage().isDisplayed()) {
				System.out.println("User--Is--In---SmartWatch--page");
			} else {
				System.out.println("User---Not---In----SmartWatch--Page");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test
	public void AddToCart() throws IOException {
		try {

			WebElement scrollToSize = pageManager.getSmartWatchPage().getScrollToSize();
			base.scrollByJs(scrollToSize, "Down");

			base.sleep(3000);
			base.Navigation("back");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
