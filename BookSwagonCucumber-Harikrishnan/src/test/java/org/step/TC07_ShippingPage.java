package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC07_ShippingPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Fill the Personal details for Shipping")
	public void user_should_fill_the_personal_details_for_shipping() throws IOException {
		try {
			base.sleep(3000);
			if (pageManager.getShipingPage().getShippingAdress().isDisplayed()) {
				System.out.println("User--is--Now---in---ShippingPage");
				base.sleep(2000);
			} else {
				System.out.println("User--is--Not--In---ShippingPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}
		try {
			WebElement recipientName = pageManager.getShipingPage().getRecipientName();
			base.sendKeysByJava(recipientName, base.readExcel(4, 1));
			base.sleep(1000);
			WebElement companyName = pageManager.getShipingPage().getCompanyName();
			base.sendKeysByJava(companyName, base.readExcel(5, 1));
			base.sleep(1000);
			WebElement adresss = pageManager.getShipingPage().getAdresss();
			base.sendKeysByJava(adresss, base.readExcel(6, 1));
			base.sleep(3000);
			WebElement selectCountry = pageManager.getShipingPage().getSelectCountry();
			base.selectByvalue(selectCountry, "India");
			base.sleep(3000);
			WebElement selectState = pageManager.getShipingPage().getSelectState();
			base.selectByvalue(selectState, "Tamil Nadu");
			base.sleep(2000);
			WebElement selectCity = pageManager.getShipingPage().getSelectCity();
			base.selectByvalue(selectCity, "Chennai");
			base.sleep(2000);
			WebElement postalCode = pageManager.getShipingPage().getPostalCode();
			base.sendKeysByJava(postalCode, "60001");
			base.sleep(2000);
			WebElement mobileNumber = pageManager.getShipingPage().getMobileNumber();
			base.sendKeysByJava(mobileNumber, base.readExcel(9, 1));
			base.sleep(2000);
			WebElement phoneNumber = pageManager.getShipingPage().getPhoneNumber();
			base.sendKeysByJava(phoneNumber, base.readExcel(8, 1));
			base.sleep(2000);
			WebElement saveAndContinue = pageManager.getShipingPage().getSaveAndContinue();
			base.clickByJS(saveAndContinue);
			base.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
