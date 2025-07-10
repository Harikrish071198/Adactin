package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TC02_LoginPage extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static PageManager pageManager = new PageManager();

	@When("User Should Enter Valid Credentials")
	public void user_should_enter_valid_credentials() throws IOException {
		WebElement mobileNumber = pageManager.getLoginPage().getMobileNumber();
		base.sendKeysByJava(mobileNumber, base.readExcel(1, 1));

		WebElement password = pageManager.getLoginPage().getPassword();
		base.sendKeysByJava(password, base.readExcel(2, 1));
	}

	@When("User Should Click Login button")
	public void user_should_click_login_button() throws InterruptedException {

		WebElement loginButton = pageManager.getLoginPage().getLoginButton();
		base.ClickByActions(loginButton);
		base.sleep(3000);
		base.Navigation("back");
		base.sleep(2000);
		base.Navigation("back");
		base.sleep(3000);
		WebElement clickFictionBooks = pageManager.getLoginPage().getClickFictionBooks();
		base.ClickByActions(clickFictionBooks);
	}

}
