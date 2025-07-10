package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SmartWatchPage extends BaseClass {

	public SmartWatchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='breadcrumb-last']")
	private WebElement validateSmartWatchPage;

	public WebElement getValidateSmartWatchPage() {
		return validateSmartWatchPage;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Size Guide']")
	private WebElement scrollToSize;

	public WebElement getScrollToSize() {
		return scrollToSize;
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Close']")
	private WebElement closeCartPage;

	public WebElement getCloseCartPage() {
		return closeCartPage;
	}

}
