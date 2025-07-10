package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation extends BaseClass {

	public OrderConfirmation() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text()='Order complete']")
	private WebElement validateConfirmation;

	public WebElement getValidateConfirmation() {
		return validateConfirmation;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='wd-tools-text'])[1]")
	private WebElement myAccount;

	public WebElement getMyAccount() {
		return myAccount;
	}

	@FindBy(how = How.XPATH, using = "(//span[text()='Logout'])[1]")
	private WebElement clickLogout;

	public WebElement getClickLogout() {
		return clickLogout;
	}

}
