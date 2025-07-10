package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC04_InformationPage extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Enter personal Details")
	public void user_should_enter_personal_details() throws IOException {
		try {

			if (pageManager.getInformationPage().getValidateInformationPage().isDisplayed()) {
				System.out.println("User_is_now_in_Information_Page");

				if (pageManager.getInformationPage().getValidateInformationPage().getText()
						.contains("Checkout: Your Information")) {
					System.out.println("User__is__in__now_in__Information__page__Aswell");
				}
			}

			else {
				System.out.println("User__not__in__Information__page");
			}
			WebElement firstName = pageManager.getInformationPage().getFirstName();
			base.sendKeysByJava(firstName, base.readExcel(3, 1));

			WebElement lastName = pageManager.getInformationPage().getLastName();
			base.sendKeysByJava(lastName, base.readExcel(4, 1));

			WebElement postalCode = pageManager.getInformationPage().getPostalCode();
			base.sendKeysByJava(postalCode, base.readExcel(5, 1));

			WebElement continueButton = pageManager.getInformationPage().getContinueButton();
			base.clickByJava(continueButton);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
