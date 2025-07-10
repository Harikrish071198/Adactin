
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
	private WebElement userName;

	public WebElement getUsername() {
		return userName;
	}

	@FindBys({ @FindBy(id = "password"), @FindBy(how = How.XPATH, using = "//input[@name='password']") })
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBys({ @FindBy(id = "login"), @FindBy(how = How.XPATH, using = "//input[@name='login']") })
	private WebElement logIn;

	public WebElement getLogin() {
		return logIn;
	}
	@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
	private WebElement validateLoginPage;

	public WebElement getValidateLoginPage() {
		return validateLoginPage;
	}
	
	
	
}
