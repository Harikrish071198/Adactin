package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Drag&Drop\\src\\Driver\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html \r\n"	);
	WebElement drag = driver.findElement(By.id("fourth"));
	WebElement drop = driver.findElement(By.id("amt8"));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
}
}
