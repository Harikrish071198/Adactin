package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC03_FictionBooksPage extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should Validate Fiction book page  and Select Bihar diaries Book")
	public void user_should_validate_fiction_book_page_and_select_bihar_diaries_book() throws IOException {
		try {
			if (pageManager.getFictionBooksPage().getValidateFictionPage().isDisplayed()) {
				System.out.println("User---Now---In---FictionBooksPage");

				if (pageManager.getFictionBooksPage().getValidateFictionPage().getText().contains("Fiction Books")) {
					System.out.println("User----Now---In----FictionBookspage---AsWell");

					WebElement clickBiharDiaries = pageManager.getFictionBooksPage().getClickBiharDiaries();
					base.ClickByActions(clickBiharDiaries);
				}
			} else {
				System.out.println("User---Not----In----FictionBookPage");
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
