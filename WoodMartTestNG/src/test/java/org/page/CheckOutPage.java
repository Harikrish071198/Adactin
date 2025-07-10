package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClass {

	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[@type='button']")
	private WebElement closeTab;

	public WebElement getCloseTab() {
		return closeTab;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='billing_first_name']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(how = How.XPATH, using = "//h3[text()='Your order']")
	private WebElement validateCheckoutpage;

	public WebElement getValidateCheckoutpage() {
		return validateCheckoutpage;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='billing_last_name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='billing_company']")
	private WebElement companyName;

	public WebElement getCompanyName() {
		return companyName;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='select2-selection select2-selection--single'])[1]")
	private WebElement selectCountry;

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[6]")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(how = How.XPATH, using = "(//input[@class='input-text '])[5]")
	private WebElement enterCity;

	public WebElement getEnterCity() {
		return enterCity;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='select2-selection select2-selection--single'])[2]")
	private WebElement selectState;

	public WebElement getSelectState() {
		return selectState;
	}

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[9]")
	private WebElement enterPindcode;

	public WebElement getEnterPindcode() {
		return enterPindcode;
	}

	@FindBy(how = How.XPATH, using = "//input[@type='tel']")
	private WebElement enterPhoneNo;

	public WebElement getEnterPhoneNo() {
		return enterPhoneNo;
	}

	@FindBy(how = How.XPATH, using = "(//input[@type='email'])[1]")
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[2]")
	private WebElement clickTerms;

	public WebElement getClickTerms() {
		return clickTerms;
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[4]")
	private WebElement clickPlaceOrder;

	public WebElement getClickPlaceOrder() {
		return clickPlaceOrder;
	}

}
