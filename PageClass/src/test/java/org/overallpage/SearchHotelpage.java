package org.overallpage;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.page.BasePage;

public class SearchHotelpage extends BasePage {

	public SearchHotelpage() {
		
	PageFactory.initElements(driver, this);
	}
	
	
	
}
