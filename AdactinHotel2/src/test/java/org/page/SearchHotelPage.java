package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBys({ @FindBy(how = How.XPATH, using = "//select[@id='hotels']"), @FindBy(name = "hotels") })
	private WebElement selecthotel;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	@FindBys({ @FindBy(how = How.XPATH, using = "//select[@id='room_type']"), @FindBy(name = "room_type") })
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='room_nos']")
	private WebElement totalrooms;

	public WebElement getTotalrooms() {
		return totalrooms;
	}

	@FindBys({ @FindBy(id = "datepick_in"), @FindBy(name = "datepick_in") })
	private WebElement checkin;

	public WebElement getCheckin() {
		return checkin;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='datepick_out']")
	private WebElement checkout;
	
	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(how=How.XPATH,using="//select[@id='adult_room']")
	private WebElement adultrooms;
	
	public WebElement getAdultrooms() {
		return adultrooms;
	}
	@FindBys({@FindBy(how=How.XPATH,using="//select[@id='child_room']"),@FindBy(name="child_room")})
	private WebElement childroom;
	
	public WebElement getChildroom() {
		return childroom;
		
	}
	@FindBys({@FindBy(id="Submit"),@FindBy(how=How.XPATH,using="//input[@name='Submit']")})
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
}
