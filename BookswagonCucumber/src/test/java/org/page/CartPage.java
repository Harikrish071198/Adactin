package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass{
	
public CartPage() {
	PageFactory.initElements(driver, this);
}


@FindBy(how=How.XPATH,using="//h1[text()='My Shopping Cart']")
private WebElement validateCartPage;


public WebElement getValidateCartPage() {
	return validateCartPage;
}
@FindBy(how=How.XPATH,using="//input[@id='ctl00_phBody_BookCart_lvCart_imgPayment']")
private WebElement clickBuy;


public WebElement getClickBuy() {
	return clickBuy;
}


}
