package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(how = How.XPATH, using = "//input[@name='username']") })
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(how = How.XPATH, using = "//td[text()='Existing User Login - Build 1']")
	private WebElement validateloginpage;

	public WebElement getValidateloginpage() {
		return validateloginpage;
	}

}
