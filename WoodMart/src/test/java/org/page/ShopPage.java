package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends BaseClass {

	public ShopPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Smart watches wood edition']")
	private WebElement selectWatch;

	public WebElement getSelectWatch() {
		return selectWatch;
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Filter by color']")
	private WebElement validateShopPage;

	public WebElement getValidateShopPage() {
		return validateShopPage;
	}

}
