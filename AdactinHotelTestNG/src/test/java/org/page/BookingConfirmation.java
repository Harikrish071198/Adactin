
package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {

	public BookingConfirmation() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//td[@class='login_title']")
	private WebElement bookingconfirmation;

	public WebElement getBookingconfirmation() {
		return bookingconfirmation;
	}

	@FindBy(xpath = "//input[@value='My Itinerary']")
	private WebElement myitinerary;

	public WebElement getMyitinerary() {
		return myitinerary;
	}
}
