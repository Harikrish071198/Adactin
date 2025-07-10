package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginAgain extends BaseClass {

	public LoginAgain() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[text()='Click here to login again']")
	private WebElement loginagain;

	public WebElement getLoginagain() {
		return loginagain;
	}

	@FindAll({ @FindBy(how = How.XPATH, using = "//td[text()='You have successfully logged out. ']"),
			@FindBy(xpath = "//td[@class='reg_success']") })
	private WebElement validateloginagain;

	public WebElement getValidateloginagain() {
		return validateloginagain;
	}

}
