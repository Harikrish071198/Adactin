package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC04_BiharDiaries extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Add Bihar Diaries book to Cart")
	public void user_should_add_bihar_diaries_book_to_cart() throws IOException {
		try {
			if (pageManager.getBiharDiariesPage().getValidateBiharDiariesPage().isDisplayed()) {
				System.out.println("User---Now---In---BiharDiariesPage");

				if (pageManager.getBiharDiariesPage().getValidateBiharDiariesPage().getText()
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
		try {
			WebElement addToCart = pageManager.getBiharDiariesPage().getAddToCart();
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
