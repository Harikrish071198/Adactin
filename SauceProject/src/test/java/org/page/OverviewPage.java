package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseClass {

	public OverviewPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Checkout: Overview']")
	private WebElement checkoutOverview;

	public WebElement getCheckoutOverview() {
		return checkoutOverview;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='btn_action cart_button']")
	private WebElement finishButton;

	public WebElement getFinishButton() {
		return finishButton;
	}

}
