package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	name.sendKeys("harkrish");
}
}
