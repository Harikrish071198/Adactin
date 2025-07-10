package org.page;

import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AgainFictionBooksPage extends BaseClass{
	
public AgainFictionBooksPage() {
	PageFactory.initElements(driver, this);
	
}
 @FindBy(how=How.XPATH,using="//span[text()='Fiction Books']")
private WebElement againFictionBooksPage;
 
public WebElement getAgainFictionBooksPage() {
	return againFictionBooksPage;
}
 
@FindBy(how=How.XPATH,using="(//a[@class='quick-view themecolor d-block text-white'])[7]")
private WebElement clickActsOfGodBook;

public WebElement getClickActsOfGodBook() {
	return clickActsOfGodBook;
}
@FindBy(how=How.XPATH,using="//span[@id='ctl00_phBody_ctl02_lblHeaderTitle']")
private WebElement scrollToNewReleases;

public WebElement getScrollToNewReleases() {
	return scrollToNewReleases;
}
@FindBy(how=How.XPATH,using="//a[@id='btnAddtoCart']")
private WebElement addToCart;

public WebElement getAddToCart() {
	return addToCart;
}
@FindBy(how=How.XPATH,using="(//button[@class='close'])[2]")
private WebElement closeCart;

public WebElement getCloseCart() {
	return closeCart;
}
@FindBy(how=How.XPATH,using="(//a[@class='quick-view themecolor'])[3]")
private WebElement clickScienceFictionBook;

public WebElement getClickScienceFictionBook() {
	return clickScienceFictionBook;
}
@FindBy(how=How.XPATH,using="//a[text()='Add To Cart']")
private WebElement addToCartBook2;

public WebElement getAddToCartBook2() {
	return addToCartBook2;
}
@FindBy(how=How.XPATH,using="(//button[@class='close'])[2]")
private WebElement closeCart2;

public WebElement getCloseCart2() {
	return closeCart2;
}
@FindBy(how=How.XPATH,using="//label[@id='ctl00_lblTotalCartItems']")
private WebElement moveToCartPage;

public WebElement getMoveToCartPage() {
	return moveToCartPage;
}



}




 

