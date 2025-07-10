package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04_AdactinBookHotel extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority=1)
	public static void Validate_Bookhotel() throws IOException {

		try {
			if (pageManager.getBookHotel().getBookhotel().isDisplayed()) {
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
		@Test(priority=2)
		public void BookHotelDetails() throws IOException {
			
		try {
			WebElement firstname = pageManager.getBookHotel().getFirstname();
			base.sendKeysByJava(firstname, base.readExcel(4, 1));
			
			WebElement lastname = pageManager.getBookHotel().getLastname();
			base.sendKeysByJava(lastname, base.readExcel(5, 1));
			
			WebElement address = pageManager.getBookHotel().getAddress();
			base.sendKeysByJava(address, base.readExcel(8, 1));
			
			WebElement creditcardno = pageManager.getBookHotel().getCreditcardno();
			base.sendKeysByJava(creditcardno, base.readExcel(6, 1));
			
			 WebElement creditcardtype = pageManager.getBookHotel().getCreditcardtype();
            base.selectByText(creditcardtype, "VISA");
            
             WebElement expirymonth = pageManager.getBookHotel().getExpirymonth();
             base.selectByText(expirymonth, "February");
             
             WebElement expiryyear = pageManager.getBookHotel().getExpiryyear();
             base.selectByText(expiryyear, "2029");
             
             WebElement cvvnumber = pageManager.getBookHotel().getCvvnumber();
             base.sendKeysByJava(cvvnumber, base.readExcel(7, 1));
             
             WebElement booknow = pageManager.getBookHotel().getBooknow();
             base.clickByJava(booknow);
             base.sleep(10000);
             
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

}
