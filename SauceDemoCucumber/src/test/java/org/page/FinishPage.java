package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends BaseClass {

	public FinishPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement validateFinish;

	public WebElement getValidateFinish() {
		return validateFinish;
	}

}
