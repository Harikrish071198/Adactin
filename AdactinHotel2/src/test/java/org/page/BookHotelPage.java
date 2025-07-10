package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id=']first_name'"),
			@FindBy(how = How.XPATH, using = "//input[@name='first_name']") })
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//textarea[@id='address']"),
			@FindBy(how = How.XPATH, using = "//textarea[@class='txtarea']") })
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='cc_num']"),
			@FindBy(how = How.XPATH, using = "(//input[@class='reg_input'])[3]") })
	private WebElement creditcardno;

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//select[@id='cc_type']"),
			@FindBy(how = How.XPATH, using = "//select[@class='select_combobox']") })
	private WebElement credittype;

	public WebElement getCredittype() {
		return credittype;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "(//select[@class='select_combobox2'])[1]"),
			@FindBy(how = How.XPATH, using = "//select[@id='cc_exp_month']") })
	private WebElement selectmonth;

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//select[@id='cc_exp_year']"),
			@FindBy(how = How.XPATH, using = "(//select[@class='select_combobox2'])[2]") })
	private WebElement selectyear;

	public WebElement getSelectyear() {
		return selectyear;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='cc_cvv']"),
			@FindBy(how = How.XPATH, using = "(//input[@class='reg_input'])[4]") })
	private WebElement ccv;

	public WebElement getCcv() {
		return ccv;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='book_now']"),
			@FindBy(how = How.XPATH, using = "//input[@name='book_now']") })
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(how = How.XPATH, using = "(//td[@class='login_title'])[2]")
	private WebElement bookhotel;

	public WebElement getBookhotel() {
		return bookhotel;
	}

}
