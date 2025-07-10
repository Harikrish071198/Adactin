package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC05_BookingConfirmationPage {
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@When("User Should Click My Itinerary To enter Book Itinerary Page")
	public void user_should_click_my_itinerary_to_enter_book_itinerary_page() throws IOException {
		try {

			if (pagemanager.getBookingConfirmation().getBookingconfirmation().isDisplayed()) {
				System.out.println("User_is_now_in_BookingConfirmation");
			} else {
				System.out.println("User_is_not_in_BookingConfirmation");
			}

		} catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();

		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();
		}
		try {

			base.sleep(3000);
			WebElement myitinerary = pagemanager.getBookingConfirmation().getMyitinerary();
			base.clickByJS(myitinerary);
			base.sleep(3000);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

}
