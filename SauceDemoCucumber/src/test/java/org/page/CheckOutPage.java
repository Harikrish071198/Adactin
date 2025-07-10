package org.page;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClass {

	public CheckOutPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='subheader']")
	private WebElement validateCheckout;

	public WebElement getValidateCheckout() {
		return validateCheckout;
	}

	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

}
