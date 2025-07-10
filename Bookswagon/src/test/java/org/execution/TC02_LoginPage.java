package org.execution;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC02_LoginPage extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageMangaer = new PageManager();

	@Before
	public void Validate_Login_page() throws IOException {
		try {
			if (pageMangaer.getLoginPage().getValidateLoginPage().isDisplayed()) {
				System.out.println("User----is---Now----in----Loginpage");

				if (pageMangaer.getLoginPage().getValidateLoginPage().getText().contains("Login")) {
					System.out.println("User---is---Loginpage---AsWell");
				}
			} else {
				System.out.println("User----is---Not----in----Loginpage");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}

	@Test
	public void EnterCredentials() throws IOException {

		try {
			WebElement mobileNumber = pageMangaer.getLoginPage().getMobileNumber();
			base.sendKeysByJava(mobileNumber, base.readExcel(1, 1));

			WebElement password = pageMangaer.getLoginPage().getPassword();
			base.sendKeysByJava(password, base.readExcel(2, 1));

			WebElement loginButton = pageMangaer.getLoginPage().getLoginButton();
			base.ClickByActions(loginButton);
			base.sleep(3000);
			base.Navigation("back");
			base.sleep(2000);
			base.Navigation("back");
		    base.sleep(3000);
			WebElement clickFictionBooks = pageMangaer.getLoginPage().getClickFictionBooks();
			base.ClickByActions(clickFictionBooks);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
		}
	}
}
