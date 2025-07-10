package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC05_AgainFictionBooksPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Before
	public void ValidateFictionPageAgain() throws IOException {

		try {
			if (pageMangaer.getAgainFictionBooksPage().getAgainFictionBooksPage().isDisplayed()) {
				System.out.println("User---is---now---again---in---FictionBooksPage");
			} else {
				System.out.println("User----is---Not--in---FictionBookPage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}

	@Test
	public void AddBooksToCart() throws IOException {
		try {

			base.sleep(3000);
			WebElement clickActsOfGodBook = pageMangaer.getAgainFictionBooksPage().getClickActsOfGodBook();
			base.clickByJS(clickActsOfGodBook);
			
			WebElement addToCart = pageMangaer.getAgainFictionBooksPage().getAddToCart();
			base.ClickByActions(addToCart);
			base.sleep(1000);
			WebElement closeCart = pageMangaer.getAgainFictionBooksPage().getCloseCart();
			base.clickByJava(closeCart);
			
			base.sleep(2000);
			WebElement scrollToNewReleases = pageMangaer.getAgainFictionBooksPage().getScrollToNewReleases();
			base.scrollByJs(scrollToNewReleases, "Down");
			
			base.sleep(2000);
			WebElement clickScienceFictionBook = pageMangaer.getAgainFictionBooksPage().getClickScienceFictionBook();
			base.clickByJS(clickScienceFictionBook);
			
			WebElement addToCartBook2 = pageMangaer.getAgainFictionBooksPage().getAddToCartBook2();
			base.ClickByActions(addToCartBook2);
			
			WebElement closeCart2 = pageMangaer.getAgainFictionBooksPage().getCloseCart2();
			base.clickByJava(closeCart2);
			
			base.sleep(2000);
			WebElement moveToCartPage = pageMangaer.getAgainFictionBooksPage().getMoveToCartPage();
			base.clickByJS(moveToCartPage);
			base.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}

	}
}
