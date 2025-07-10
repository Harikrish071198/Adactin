package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//td[text()='Select Hotel ']")
	private WebElement selecttext;

	public WebElement getSelecttext() {
		return selecttext;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='radiobutton_0']"),
			@FindBy(how = How.XPATH, using = "//input[@name='radiobutton_0']") })
	private WebElement selecthotel;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='continue']"),
			@FindBy(how = How.XPATH, using = "(//input[@class='reg_button'])[1]") })
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}
}
