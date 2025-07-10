package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FictionBooksPage extends BaseClass{
	
public FictionBooksPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using="//span[text()='Fiction Books']")
private WebElement validateFictionPage;

public WebElement getValidateFictionPage() {
	return validateFictionPage;
}
@FindBy(how=How.XPATH,using="(//div[@class='text-center position-relative blackhover'])[5]")
private WebElement clickBiharDiaries;

public WebElement getClickBiharDiaries() {
	return clickBiharDiaries;
}


}
