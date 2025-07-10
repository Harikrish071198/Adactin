package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC04_SmartWatchPage extends BaseClass{
	
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should validate Watch Page")
	public void user_should_validate_watch_page() throws IOException {
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
