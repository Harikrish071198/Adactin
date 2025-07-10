package org.execution;

import java.io.IOException;

import org.base.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC08_AgainLoginPage {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Test(priority = 13)
	public void ValidateHomePage() throws IOException {
		try {
			if (pageMangaer.getAgainLoginPage().getValidateReviewOrder().isDisplayed()) {
				System.out.println("User---In---Review--Order---Page");

				WebElement backToHomePage = pageMangaer.getAgainLoginPage().getBackToHomePage();
				base.ClickByActions(backToHomePage);

				WebElement getclickMyAcc = pageMangaer.getAgainLoginPage().getclickMyAcc();
				base.MouseHover(getclickMyAcc);

				WebElement clickLogOut = pageMangaer.getAgainLoginPage().getClickLogOut();
				base.ClickByActions(clickLogOut);
			} else {
				System.out.println("User----Not----In---Review----order---Page");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();

		}
	}
}
