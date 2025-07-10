package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

public class TC07_AdactinLoginAgain extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();
	
	@Before
	public void Validate_LoginAgain() throws IOException, InterruptedException {
		try {
			if(pageManager.getLoginagain().getValidateloginagain().isDisplayed()) {
				System.out.println("User_is _now_in_again_login_Page");
			}
			else {
				System.out.println("User_is_not_in_again_login_page");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
			
		}

	}

	@Test
	public void AgainLogin() throws IOException, InterruptedException {
		try {
			WebElement loginagain = pageManager.getLoginagain().getLoginagain();
			base.clickByJS(loginagain);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			base.screenCapture();
			base.sleep(5000);
		}

	}
}
