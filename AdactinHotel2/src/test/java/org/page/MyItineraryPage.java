package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyItineraryPage extends BaseClass {

	public MyItineraryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//td[text()='Booked Itinerary']")
	private WebElement bookitinerary;

	public WebElement getBookitinerary() {
		return bookitinerary;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='check_all']"),
			@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]") })
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='cancelall']")
	private WebElement cancelselected;

	public WebElement getCancelselected() {
		return cancelselected;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
