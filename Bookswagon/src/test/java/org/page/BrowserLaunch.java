package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BrowserLaunch extends BaseClass{
 
	public BrowserLaunch() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//img[@class='logonew']")
	private WebElement validateBrowserLaunch;

	public WebElement getValidateBrowserLaunch() {
		return validateBrowserLaunch;
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='ctl00_lblUser']")
	private WebElement loginPage;

	public WebElement getLoginPage() {
		return loginPage;
	}
	@FindBy(how=How.XPATH,using="//a[text()='Log in']")
private WebElement	loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
}
