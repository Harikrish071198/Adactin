package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@CacheLookup
	
	@FindBy(how=How.XPATH,using="//h4[text()='Accepted usernames are:']")
	 private WebElement validateLogin;
	
	public WebElement getValidateLogin() {
		return validateLogin;
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
}
