package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04_BiharDiariesPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Test(priority = 6)
	public void ValidateBiharDiariesPage() throws IOException {
		try {
			if (pageMangaer.getBiharDiariesPage().getValidateBiharDiariesPage().isDisplayed()) {
				System.out.println("User---Now---In---BiharDiariesPage");

				if (pageMangaer.getBiharDiariesPage().getValidateBiharDiariesPage().getText()
						.contains("Bihar Diaries")) {
					System.out.println("User----Now---In---BiharDiariesPage---AsWell");
				}
			} else {
				System.out.println("User---Not---In----BiharDiariesPage");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test(priority = 7)
	public void AddToCart() throws IOException {
		try {
			WebElement addToCart = pageMangaer.getBiharDiariesPage().getAddToCart();
			base.ClickByActions(addToCart);
			base.sleep(2000);
			base.Navigation("back");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}