package org.step;

import org.base.BaseClass;
import org.manager.PageManager;

import io.cucumber.java.en.Then;

public class TC06_FinishPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();
	

	@Then("User Should Validate Final Page")
	public void user_should_validate_final_page() {
		if (pageManager.getFinishPage().getValidateFinish().isDisplayed()) {
			System.out.println("User----Now----In----Finish----Page");

			if (pageManager.getFinishPage().getValidateFinish().getText().contains("THANK YOU FOR YOUR ORDER")) {
				System.out.println("User___Now___in___THANK YOU FOR YOUR ORDER__Page__Aswell");
			}
		} else {
			System.out.println("User----Not----in----Finish----page");
		}
	}

}
