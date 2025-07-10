package org.execution;

import java.io.IOException;

import org.global.BaseClass;

import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC07_AdactinLoginAgain extends BaseClass {

	public static BaseClass base = new BaseClass();

	public static PageManager pageManager = new PageManager();
	
	
	@Test(priority=2)
	public void AgainLogin() throws IOException, InterruptedException {
		try {
			base.sleep(3000);
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
