package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
 
	public BookHotel() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement bookhotel;

	public WebElement getBookhotel() {
		return bookhotel;
	}

	@FindAll({ @FindBy(id = "first_name"), @FindBy(how = How.XPATH, using = "//input[@name='first_name']") })
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindAll({ @FindBy(id = "last_name"), @FindBy(how = How.XPATH, using = "//input[@name='last_name']") })
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindAll({ @FindBy(id = "address"), @FindBy(how = How.XPATH, using = "//textarea[@name='address']") })
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindAll({ @FindBy(id = "cc_num"), @FindBy(how = How.XPATH, using = "//input[@name='cc_num']") })
	private WebElement creditcardno;

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	@FindAll({ @FindBy(id = "cc_type"), @FindBy(how = How.XPATH, using = "//select[@name='cc_type']") })
	private WebElement creditcardtype;

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(how = How.XPATH, using = "//select[@name='cc_exp_month']") })
	private WebElement expirymonth;

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	@FindAll({ @FindBy(id = "cc_exp_year"), @FindBy(how = How.XPATH, using = "//select[@name='cc_exp_month']") })
	private WebElement expiryyear;

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	@FindAll({ @FindBy(id = "cc_cvv"), @FindBy(how = How.XPATH, using = "//input[@name='cc_cvv']") })
	private WebElement cvvnumber;

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	@FindAll({ @FindBy(id = "book_now"), @FindBy(how = How.XPATH, using = "//input[@name='book_now']") })
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

}
