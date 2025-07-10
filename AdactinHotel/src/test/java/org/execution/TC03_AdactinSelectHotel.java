 package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class TC03_AdactinSelectHotel extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@After
	public void SelectHotel() throws IOException {

		try {
			if (pageManager.getSelectHotel().getValidateselecthotel().isDisplayed()) {

				System.out.println("User_loggedIn_SelectHotelPage_Successfully");
			} else {
				System.out.println("User_not_in_SelectHotelPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test
	public void SelectAndContinue() throws IOException {

		try {

			WebElement selecthotel = pageManager.getSelectHotel().getSelecthotel();
			base.clickByJava(selecthotel);

			WebElement continuebutton = pageManager.getSelectHotel().getContinuebutton();
			base.clickByJava(continuebutton);
			base.sleep(5000);

		}

		catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
