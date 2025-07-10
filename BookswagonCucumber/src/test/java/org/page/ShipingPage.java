package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.Weak;

public class ShipingPage extends BaseClass {

	public ShipingPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//div[@class='title']")
	private WebElement shippingAdress;

	public WebElement getShippingAdress() {
		return shippingAdress;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_cpBody_txtNewRecipientName']")
	private WebElement recipientName;

	public WebElement getRecipientName() {
		return recipientName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_cpBody_txtNewCompanyName']")
	private WebElement companyName;

	public WebElement getCompanyName() {
		return companyName;
	}

	@FindBy(how = How.XPATH, using = "//textarea[@name='ctl00$cpBody$txtNewAddress']")
	private WebElement adresss;

	public WebElement getAdresss() {
		return adresss;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='ctl00_cpBody_ddlNewCountry']")
	private WebElement selectCountry;

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='ctl00_cpBody_ddlNewState']")
	private WebElement selectState;

	public WebElement getSelectState() {
		return selectState;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='ctl00_cpBody_ddlNewCities']")
	private WebElement selectCity;

	public WebElement getSelectCity() {
		return selectCity;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_cpBody_txtNewPincode']")
	private WebElement postalCode;

	public WebElement getPostalCode() {
		return postalCode;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_cpBody_txtNewMobile']")
	private WebElement mobileNumber;

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_cpBody_txtNewPhone']")
	private WebElement phoneNumber;

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='ctl00$cpBody$imgSaveNew']")
	private WebElement saveAndContinue;

	public WebElement getSaveAndContinue() {
		return saveAndContinue;
	}

}
