package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Registration {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Actions\\src\\Driver\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://www.amazon.in\r\n");
	
	Actions a = new Actions(driver);
	
	 WebElement hover = driver.findElement(By.xpath("//a[@id='nav-link-groceries']"));
	
	 a.moveToElement(hover).perform();
	 
	WebElement click = driver.findElement(By.partialLinkText("SY269FMpng"));
	
	a.click(click).perform();
}
}
