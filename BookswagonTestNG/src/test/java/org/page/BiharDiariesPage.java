package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BiharDiariesPage extends BaseClass{
public BiharDiariesPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using="//div[@class='col-md-12 mb-3']")
private WebElement validateBiharDiariesPage;

public WebElement getValidateBiharDiariesPage() {
	return validateBiharDiariesPage;
}
@FindBy(how=How.XPATH,using="//a[@id='btnAddtocart']")
private WebElement addToCart;

public WebElement getAddToCart() {
	return addToCart;
}


}
