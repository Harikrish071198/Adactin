package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass{

	public BookingConfirmationPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//td[text()='Booking Confirmation ']")
	private WebElement bookingconfirmation;
	
	public WebElement getBookingconfirmation() {
		return bookingconfirmation;
	}
	
	@FindAll({@FindBy(how=How.XPATH,using="//input[@id='my_itinerary']"),@FindBy(how=How.XPATH,using="(//input[@class=\"reg_button\"])[2]")})
	
	private WebElement myitinerary;
}
