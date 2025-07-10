package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/");
	List<WebElement> findElements = driver.findElements(By.tagName("frame"));
	int size = findElements.size();
	System.out.println(size);
	driver.switchTo().frame(0);
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("Harikrish");
	driver.switchTo().defaultContent();
}
}
