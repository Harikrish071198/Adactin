package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BaseClass {

	public MyAccountPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h1[@class='entry-title title']")
	private WebElement validateMyAccountPage;

	public WebElement getValidateMyAccountPage() {
		return validateMyAccountPage;
	}

	@FindBy(how = How.XPATH, using = "(//a[@class='woodmart-nav-link'])[24]")
	private WebElement enterShop;

	public WebElement getEnterShop() {
		return enterShop;
	}

	@FindBy(how = How.XPATH, using = "(//a[@href='https://woodmart.xtemos.com/shop/?opt=list_view'])[1]")
	private WebElement selectProductView;

	public WebElement getSelectProductView() {
		return selectProductView;
	}

}
