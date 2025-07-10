package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC07_ShipingPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Before
	public void Validate_Shpping_page() throws IOException {
		try {
			base.sleep(3000);
			if (pageMangaer.getShipingPage().getShippingAdress().isDisplayed()) {
				System.out.println("User--is--Now---in---ShippingPage");
				base.sleep(2000);
			} else 
			{
				System.out.println("User--is--Not--In---ShippingPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}

	}

	@Test
	public void EnterShippingDetails() throws IOException {
		try {
			WebElement recipientName = pageMangaer.getShipingPage().getRecipientName();
			base.sendKeysByJava(recipientName, base.readExcel(4, 1));
			base.sleep(1000);
			WebElement companyName = pageMangaer.getShipingPage().getCompanyName();
			base.sendKeysByJava(companyName, base.readExcel(5, 1));
			base.sleep(1000);
			WebElement adresss = pageMangaer.getShipingPage().getAdresss();
			base.sendKeysByJava(adresss, base.readExcel(6, 1));
			base.sleep(3000);
			WebElement selectCountry = pageMangaer.getShipingPage().getSelectCountry();
			base.selectByvalue(selectCountry, "India");
			base.sleep(3000);
			WebElement selectState = pageMangaer.getShipingPage().getSelectState();
			base.selectByvalue(selectState, "Tamil Nadu");
			base.sleep(2000);
			WebElement selectCity = pageMangaer.getShipingPage().getSelectCity();
			base.selectByvalue(selectCity, "Chennai");
			base.sleep(2000);
			WebElement postalCode = pageMangaer.getShipingPage().getPostalCode();
			base.sendKeysByJava(postalCode, "60001");
			base.sleep(2000);
			WebElement mobileNumber = pageMangaer.getShipingPage().getMobileNumber();
			base.sendKeysByJava(mobileNumber, base.readExcel(9, 1));
			base.sleep(2000);
			WebElement phoneNumber = pageMangaer.getShipingPage().getPhoneNumber();
			base.sendKeysByJava(phoneNumber, base.readExcel(8, 1));
			base.sleep(2000);
			WebElement saveAndContinue = pageMangaer.getShipingPage().getSaveAndContinue();
			base.clickByJS(saveAndContinue);
			base.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
