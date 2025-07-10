package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC03_FictionBooksPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Test
	public void ValidateFictionPage() throws IOException {
		try {
			if (pageMangaer.getFictionBooksPage().getValidateFictionPage().isDisplayed()) {
				System.out.println("User---Now---In---FictionBooksPage");

				if (pageMangaer.getFictionBooksPage().getValidateFictionPage().getText().contains("Fiction Books")) {
					System.out.println("User----Now---In----FictionBookspage---AsWell");

					WebElement clickBiharDiaries = pageMangaer.getFictionBooksPage().getClickBiharDiaries();
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
