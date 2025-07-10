package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AgainShopPage extends BaseClass {

	public AgainShopPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Filter by color']")
	private WebElement validateAgainShopPage;

	public WebElement getValidateAgainShopPage() {
		return validateAgainShopPage;
	}

	@FindBy(how = How.XPATH, using = "//a[@aria-label='Add to cart: “Augue adipiscing euismod”']")
	private WebElement addToy;

	public WebElement getAddToy() {
		return addToy;
	}

	@FindBy(how = How.XPATH, using = "//a[@aria-label='Add to cart: “Decoration wooden present”']")
	private WebElement selectDecorationToCart;

	public WebElement getSelectDecorationToCart() {
		return selectDecorationToCart;
	}

	@FindBy(how = How.XPATH, using = "(//a[text()='Close'])[2]")
	private WebElement closeCartPage;

	public WebElement getCloseCartPage() {
		return closeCartPage;
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Checkout']")
	private WebElement clickCheckPage;

	public WebElement getClickCheckPage() {
		return clickCheckPage;
	}

}
