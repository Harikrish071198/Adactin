package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(how=How.XPATH,using="//input[@name='radiobutton_0']")})
	 private WebElement selecthotel;

	public WebElement getSelecthotel() {
		return selecthotel;
	}
	
	@FindAll({@FindBy(how=How.XPATH,using="//input[@name='continue']"),@FindBy(id="continue")})
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement validateselecthotel;

	public WebElement getValidateselecthotel() {
		return validateselecthotel;
	}
	
	
}
