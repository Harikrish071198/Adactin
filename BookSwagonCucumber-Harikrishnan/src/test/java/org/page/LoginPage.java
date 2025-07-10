package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
public LoginPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using="//h3[text()='Log in']")
private WebElement validateLoginPage;

public WebElement getValidateLoginPage() {
	return validateLoginPage;
}

@FindBy(how=How.XPATH,using="//input[@id='ctl00_phBody_SignIn_txtEmail']")
private WebElement mobileNumber;

public WebElement getMobileNumber() {
	return mobileNumber;
}
@FindBy(how=How.XPATH,using="//input[@id='ctl00_phBody_SignIn_txtPassword']")
private WebElement password;

public WebElement getPassword() {
	return password;
}
@FindBy(how=How.XPATH,using="//a[@id='ctl00_phBody_SignIn_btnLogin']")
private WebElement loginButton;

public WebElement getLoginButton() {
	return loginButton;
}
@FindBy(how=How.XPATH,using="//a[text()='Fiction Books']")
private WebElement clickFictionBooks;

public WebElement getClickFictionBooks() {
	return clickFictionBooks;
}


}
