package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage extends BaseClass {

	public AddCartPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//div[text()='Products']")
	private WebElement validateProductPage;

	public WebElement getValidateProductPage() {
		return validateProductPage;

	}

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement lowToHighPrice;

	public WebElement getLowToHighPrice() {
		return lowToHighPrice;
	}

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[5]")
	private WebElement backBag;

	public WebElement getBackBag() {
		return backBag;
	}

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[2]")
	private WebElement bikeLight;

	public WebElement getBikeLight() {
		return bikeLight;
	}

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
	private WebElement redTshirt;

	public WebElement getRedTshirt() {
		return redTshirt;
	}

	@FindBy(xpath = "//button[text()='ADD TO CART'][1]")
	private WebElement blackTshirt;

	public WebElement getBlackTshirt() {
		return blackTshirt;
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']")
	private WebElement addCart;

	public WebElement getAddCart() {
		return addCart;
	}

}
