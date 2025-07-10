package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC06_AdactinBookedItineraryPage extends BaseClass {
	
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();
	
	@When("User Should Cancel the Booking Order & Logout")
	public void user_should_cancel_the_booking_order_logout() throws IOException {
		try {
			base.sleep(2000);
			WebElement clickbutton = pagemanager.getBookedItinerary().getClickbutton();
			base.clickByJava(clickbutton);
			base.sleep(2000);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {
			WebElement cancelselected = pagemanager.getBookedItinerary().getCancelselected();
			base.clickByJava(cancelselected);

			base.sleep(3000);

			base.handleAlert();

			WebElement logout = pagemanager.getBookedItinerary().getLogout();
			base.clickByJava(logout);
			base.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {
			if (pagemanager.getBookedItinerary().getBookedItinerary().isDisplayed()) {
				System.out.println("User_in_booked_itinerary_page");
			} else {

				System.out.println("User_not_in_itinerary_page");
			}

		} catch (Exception e) {
	
		}
	}

}
