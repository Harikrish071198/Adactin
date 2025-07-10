package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", 
"C:\\Users\\harik\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.instagram.com/");

String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
String pageSource = driver.getPageSource();
System.out.println(pageSource);
driver.close();




WebElement insta = driver.findElement(By.tagName("i"));
insta.getText();
System.out.println(insta);
	}
}
