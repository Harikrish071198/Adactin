package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//h2[text()='Login']")
	private WebElement validateLogiPage;

	public WebElement getValidateLogiPage() {
		return validateLogiPage;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

}
