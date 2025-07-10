package org.dem;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broserlaunch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\ScrollUp&Down\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/documentation/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement scroll11 = driver.findElement(By.xpath("//img[@alt='Bright Data']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scroll11);
	Thread.sleep(2000);
	WebElement scrollup = driver.findElement(By.xpath("//a[text()='freely available']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
	
	
}
}
