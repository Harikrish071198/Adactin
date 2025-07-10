package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.testng.annotations.Test;

public class TC06_FinishPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();

	@Test(priority = 11)
	public void ValidateFinishPage() throws IOException {
		try {

			if (pageManager.getFinishPage().getValidateFinish().isDisplayed()) {
				System.out.println("User----Now----In----Finish----Page");

				if (pageManager.getFinishPage().getValidateFinish().getText().contains("THANK YOU FOR YOUR ORDER")) {
					System.out.println("User___Now___in___THANK YOU FOR YOUR ORDER__Page__Aswell");
				}
			} else {
				System.out.println("User----Not----in----Finish----page");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
