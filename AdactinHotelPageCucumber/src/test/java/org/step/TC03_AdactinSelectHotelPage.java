package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC03_AdactinSelectHotelPage {

	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@When("User Should Click Selected Hotel")
	public void user_should_click_selected_hotel() throws IOException {
		try {
			if (pagemanager.getSelectHotel().getValidateselecthotel().isDisplayed()) {

				System.out.println("User_loggedIn_SelectHotelPage_Successfully");
			} else {
				System.out.println("User_not_in_SelectHotelPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

		try {

			WebElement selecthotel = pagemanager.getSelectHotel().getSelecthotel();
			base.clickByJava(selecthotel);

			WebElement continuebutton = pagemanager.getSelectHotel().getContinuebutton();
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