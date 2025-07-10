package org.overallpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.page.BasePage;

public class LoginPage extends BasePage {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBys({ @FindBy(id = "username"), @FindBy(how = How.XPATH, using = "//input[@name='username']") })
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBys({ @FindBy(id = "password"), @FindBy(how = How.XPATH, using = "//input[@name='password']") })
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
