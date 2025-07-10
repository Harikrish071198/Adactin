package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC05_AgainFictionPage extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@When("User Should Enter Again LoginPage and Add Two Books to Cart")
	public void user_should_enter_again_login_page_and_add_two_books_to_cart() throws IOException {
		try {
			if (pageManager.getAgainFictionBooksPage().getAgainFictionBooksPage().isDisplayed()) {
				System.out.println("User---is---now---again---in---FictionBooksPage");
			} else {
				System.out.println("User----is---Not--in---FictionBookPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
		try {

			base.sleep(3000);
			WebElement clickActsOfGodBook = pageManager.getAgainFictionBooksPage().getClickActsOfGodBook();
			base.clickByJS(clickActsOfGodBook);

			WebElement addToCart = pageManager.getAgainFictionBooksPage().getAddToCart();
			base.ClickByActions(addToCart);
			base.sleep(1000);
			WebElement closeCart = pageManager.getAgainFictionBooksPage().getCloseCart();
			base.clickByJava(closeCart);

			base.sleep(2000);
			WebElement scrollToNewReleases = pageManager.getAgainFictionBooksPage().getScrollToNewReleases();
			base.scrollByJs(scrollToNewReleases, "Down");

			base.sleep(2000);
			WebElement clickScienceFictionBook = pageManager.getAgainFictionBooksPage().getClickScienceFictionBook();
			base.clickByJS(clickScienceFictionBook);

			WebElement addToCartBook2 = pageManager.getAgainFictionBooksPage().getAddToCartBook2();
			base.ClickByActions(addToCartBook2);

			WebElement closeCart2 = pageManager.getAgainFictionBooksPage().getCloseCart2();
			base.clickByJava(closeCart2);

			base.sleep(2000);
			WebElement moveToCartPage = pageManager.getAgainFictionBooksPage().getMoveToCartPage();
			base.clickByJS(moveToCartPage);
			base.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
