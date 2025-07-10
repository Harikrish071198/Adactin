package org.dem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harik\\eclipse-workspace\\WindowsHandle\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("iphone15promax",Keys.ENTER);
	WebElement iphone1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro Max (256 GB) - Black Titanium']"));
	iphone1.click();
	String parentWindowId = driver.getWindowHandle();
	System.out.println("parent WindowId is"+parentWindowId);
	Set<String> allWindowId = driver.getWindowHandles();
	for(String h:allWindowId) {
		if(!parentWindowId.equals(h)) {
			
		
		System.out.println("child window Id is"+h);
		driver.switchTo().window(h);
		}
		
	}
	WebElement cart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	cart.click();
	driver.switchTo().window(parentWindowId);
	WebElement iphone2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']"));
	iphone2.click();
	Set<String> allWindowId2 = driver.getWindowHandles();
	List<String> li=new ArrayList();
	li.addAll(allWindowId2);
	String secondChildId = li.get(2);
	System.out.println("second child id is"+secondChildId);
	driver.switchTo().window(secondChildId);
	WebElement cart1 = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	cart1.click();
	
}

}
