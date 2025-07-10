package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AgainLoginPage extends BaseClass{

	public AgainLoginPage() {
		PageFactory.initElements(driver, this);
}
	@FindBy(how=How.XPATH,using="//td[text()='You have successfully logged out. ']")
	
	private WebElement againlogintext;
	
	public WebElement getAgainlogintext() {
		return againlogintext;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Click here to login again']")
	private WebElement clicklogin;
	
	public WebElement getClicklogin() {
		return clicklogin;
	}
}
