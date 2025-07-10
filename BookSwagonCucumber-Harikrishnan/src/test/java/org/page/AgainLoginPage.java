package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AgainLoginPage extends BaseClass {

	public AgainLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[text()='View Cart']")
	private WebElement ValidateReviewOrder;
	
	public WebElement getValidateReviewOrder() {
		return ValidateReviewOrder;
	}
	@FindBy(how=How.XPATH,using="//img[@id='ctl00_imglogo']")
	private WebElement backToHomePage;

	public WebElement getBackToHomePage() {
		return backToHomePage;
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='ctl00_lblUser']")
	private WebElement clickMyAcc;

	public WebElement getclickMyAcc() {
		return clickMyAcc;
}
	@FindBy(how=How.XPATH,using="//a[@id='ctl00_lnkbtnLogout']")
	private WebElement clickLogOut;

	public WebElement getClickLogOut() {
		return clickLogOut;
	}
	
	
}
