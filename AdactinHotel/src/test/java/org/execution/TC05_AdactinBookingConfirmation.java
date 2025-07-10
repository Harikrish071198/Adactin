package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class TC05_AdactinBookingConfirmation extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@After
	
	public void Validate_BookingConfirmation() throws IOException {
		
		try {
			
			if(pageManager.getBookingConfirmation().getBookingconfirmation().isDisplayed()) {
				System.out.println("User_is_now_in_BookingConfirmation");
			}
			else {
				System.out.println("User_is_not_in_BookingConfirmation");
			}
			
		} 
		catch (SessionNotCreatedException e) {
			System.out.println("check browser version _" + e.getMessage());
			base.screenCapture();
			
		} catch (WebDriverException e) {
			System.out.println("Check WebDriver version" + e.getMessage());
			base.screenCapture();
		}
	}
	
	@Test
	public void BookingConfirmation() throws IOException {
		
		try {
			
			base.sleep(3000);
			WebElement myitinerary = pageManager.getBookingConfirmation().getMyitinerary();
			base.clickByJS(myitinerary);
			base.sleep(3000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
		

	}

