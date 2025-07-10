package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC04_AdactinBookHotelPage {
	public static BaseClass base = new BaseClass();
	public static PageManager pagemanager = new PageManager();

	@When("User Should Validate Book Hotel Page")
	public void user_should_validate_book_hotel_page() throws IOException {
		try {
			if (pagemanager.getBookHotel().getBookhotel().isDisplayed()) {
				System.out.println("User_Entered_BookHotel_page");
			} 
			else {
				System.out.println("User_not_Entered_BookHotel_page");
			}
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

	@When("User Should Enter Personal Details to Book Hotel")
	public void user_should_enter_personal_details_to_book_hotel() throws IOException {
		try {
			WebElement firstname = pagemanager.getBookHotel().getFirstname();
			base.sendKeysByJava(firstname, base.readExcel(4, 1));
			
			WebElement lastname = pagemanager.getBookHotel().getLastname();
			base.sendKeysByJava(lastname, base.readExcel(5, 1));
			
			WebElement address = pagemanager.getBookHotel().getAddress();
			base.sendKeysByJava(address, base.readExcel(8, 1));
			
			WebElement creditcardno = pagemanager.getBookHotel().getCreditcardno();
			base.sendKeysByJava(creditcardno, base.readExcel(6, 1));
			
			 WebElement creditcardtype = pagemanager.getBookHotel().getCreditcardtype();
            base.selectByText(creditcardtype, "VISA");
            
             WebElement expirymonth = pagemanager.getBookHotel().getExpirymonth();
             base.selectByText(expirymonth, "February");
             
             WebElement expiryyear = pagemanager.getBookHotel().getExpiryyear();
             base.selectByText(expiryyear, "2029");
             
             WebElement cvvnumber = pagemanager.getBookHotel().getCvvnumber();
             base.sendKeysByJava(cvvnumber, base.readExcel(7, 1));
             
             WebElement booknow = pagemanager.getBookHotel().getBooknow();
             base.clickByJava(booknow);
             base.sleep(10000);
             
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	    	}
}
