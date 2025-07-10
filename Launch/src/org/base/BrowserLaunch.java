package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\Launch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement username = driver.findElement(By.xpath("//input[@name='email']']"));
	js.executeScript("arguments[0].setAttribute('value','harikrish')", username);
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].setAttribute('value','98765')", password);

	
}
}
