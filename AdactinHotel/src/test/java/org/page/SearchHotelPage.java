package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "location"), @FindBy(how = How.XPATH, using = "//select[@name='location']") })
	private WebElement location;

	public WebElement getLocation() {
		return location;

	}

	@FindAll({ @FindBy(id = "hotels"), @FindBy(how = How.XPATH, using = "//slect[@name='hotels']") })
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}

	@FindAll({ @FindBy(id = "room_nos"), @FindBy(how = How.XPATH, using = "//select[@name='room_nos']") })
	private WebElement numberOfRooms;

	public WebElement getNumberofrooms() {
		return numberOfRooms;
	}

	@FindAll({ @FindBy(id = "datepick_in"), @FindBy(how = How.XPATH, using = "//input[@name='datepick_in']") })
	private WebElement chechInDate;

	public WebElement getChechindate() {
		return chechInDate;
	}

	@FindAll({ @FindBy(id = "datepick_out"), @FindBy(how = How.XPATH, using = "//input[@name='datepick_out']") })
	private WebElement checkOutDate;

	public WebElement getCheckoutdate() {
		return checkOutDate;
	}

	@FindAll({ @FindBy(id = "adult_room"), @FindBy(how = How.XPATH, using = "//select[@name='adult_room']") })
	private WebElement adultsPerRoom;

	public WebElement getAdultsperroom() {
		return adultsPerRoom;
	}

	@FindAll({ @FindBy(id = "child_room"), @FindBy(how = How.XPATH, using = "//select[@name='child_room']") })
	private WebElement childrensPerRoom;

	public WebElement getChildrensperroom() {
		return childrensPerRoom;
	}

	@FindAll({ @FindBy(id = "submit"), @FindBy(how = How.XPATH, using = "//input[@name='Submit']") })
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement searchPage;

	public WebElement getSearchHotel() {
		return searchPage;
	}

	}

	
	
	
	


