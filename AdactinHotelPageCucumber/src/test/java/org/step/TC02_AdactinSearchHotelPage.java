package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC02_AdactinSearchHotelPage {
	
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();
	
	@When("User should Validate Search Hotel Page")
	public void user_should_validate_search_hotel_page() throws IOException {
		try {

			if (pagemanager.getSearchHotelPage().getSearchHotel().isDisplayed()) {

				System.out.println("User_successfully_entered_Search_Hotel_page");

				if (pagemanager.getSearchHotelPage().getSearchHotel().isEnabled()) {
					System.out.println("User_successfully_logged_in_Hotelpage");

				}

			}

			else {
				System.out.println("User Not_Successfully_entered_In_search_Hotel_page");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@When("User Should Select Hotel & Enter Details")
	public void user_should_select_hotel_enter_details() throws IOException {
		try {

			WebElement location = pagemanager.getSearchHotelPage().getLocation();
			base.selectByvalue(location, "Brisbane");

			WebElement hotels = pagemanager.getSearchHotelPage().getHotels();
			base.selectByvalue(hotels, "Hotel Creek");

			WebElement roomType = pagemanager.getSearchHotelPage().getRoomType();
			base.selectByText(roomType, "Standard");

			WebElement chechInDate = pagemanager.getSearchHotelPage().getChechindate();
			base.sendKeysByJava(chechInDate, base.readExcel(9, 1));

			WebElement checkoutdate = pagemanager.getSearchHotelPage().getCheckoutdate();
			base.sendKeysByJava(checkoutdate, base.readExcel(10, 1));

			WebElement adultsperroom = pagemanager.getSearchHotelPage().getAdultsperroom();
			base.selectByText(adultsperroom, "3 - Three");

			WebElement childrensperroom = pagemanager.getSearchHotelPage().getChildrensperroom();
			base.selectByText(childrensperroom, "2 - Two");

			WebElement search = pagemanager.getSearchHotelPage().getSearch();
			base.clickByJava(search);
			base.sleep(3000);

		} catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();

		} catch (IOException e) {
			System.out.println("Check data acess version" + e.getMessage());
			base.screenCapture();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
	}



