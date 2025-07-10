package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC06_AdactinBookedItinerary extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@BeforeClass
	public static void Validate_BookedItinerary() throws IOException {

		try {
			WebElement clickbutton = pageManager.getBookedItinerary().getClickbutton();
			base.clickByJava(clickbutton);
			base.sleep(2000);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test
	public void CancelBookedRooms() throws IOException {
		try {
			WebElement cancelselected = pageManager.getBookedItinerary().getCancelselected();
			base.clickByJava(cancelselected);

			base.sleep(3000);

			base.handleAlert();

			WebElement logout = pageManager.getBookedItinerary().getLogout();
			base.clickByJava(logout);
			base.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@BeforeClass
	public static void Validate_booked_itinerary() {

		try {
			if (pageManager.getBookedItinerary().getBookedItinerary().isDisplayed()) {
				System.out.println("User_in_booked_itinerary_page");
			} else {

				System.out.println("User_not_in_itinerary_page");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
