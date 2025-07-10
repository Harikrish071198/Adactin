package org.base;

import org.global.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScript extends BaseClass{
	
public static void main(String[] args) throws InterruptedException {
	
	BaseClass base =new BaseClass();
	
	base.getDriver("chrome");
	base.launchUrl("https://adactinhotelapp.com/");
	
	base.winMax();
	Thread.sleep(3000);
	
	WebElement user = driver.findElement(By.id("username"));
	base.senKeysByJava(user, "Harikrishpc07");
	
	WebElement pass= driver.findElement(By.id("password"));
	base.sendKeysByJS(pass, "Hk071198");
	
	 WebElement loginbutton = driver.findElement(By.id("login"));
	 base.clickByJS(loginbutton);
	 
	 WebElement scrolldown = driver.findElement(By.xpath("//td[text()='Get solutions for all your testing needs. Visit ']"));
	 base.scrollByJS(scrolldown, "Down");
}
}
