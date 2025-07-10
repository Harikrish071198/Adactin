package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends BaseClass {

	public BookedItinerary() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how =How.XPATH,using= "//td[@class='login_title']")
	private WebElement bookedItinerary;

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	@FindBy(how=How.XPATH,using="//input[@id='check_all']")
	private WebElement clickButton;

	public WebElement getClickbutton() {
		return clickButton;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='cancelall']")
	private WebElement cancelSelected;

	public WebElement getCancelselected() {
		return cancelSelected;
	}

	@FindBy(id = "logout")
	private WebElement logOut;

	public WebElement getLogout() {
		return logOut;
	}

}
