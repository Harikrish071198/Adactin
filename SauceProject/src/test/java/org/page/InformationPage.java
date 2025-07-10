package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InformationPage extends BaseClass {

	public InformationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//div[text()='Checkout: Your Information']")
	private WebElement validateInformationPage;

	public WebElement getValidateInformationPage() {
		return validateInformationPage;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='last-name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='postal-code']")
	private WebElement postalCode;

	public WebElement getPostalCode() {
		return postalCode;
	}

	@FindBy(how = How.XPATH, using = "//input[@class='btn_primary cart_button']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

}
