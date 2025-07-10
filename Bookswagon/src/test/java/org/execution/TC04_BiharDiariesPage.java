package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC04_BiharDiariesPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Before
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

	@Test
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