package org.dem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\WindowsHandle\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("redmi 5g mobile",Keys.ENTER);
	WebElement apple = driver.findElement(By.xpath("//div[text()='REDMI 13C 5G (Startrail Green, 128 GB)']"));
	apple.click();
	String parentWindowId = driver.getWindowHandle();
	System.out.println("parent window id is"+parentWindowId);
	Set<String> allWindowId = driver.getWindowHandles();
	for(String h:allWindowId){
		if(!parentWindowId.equals(h)) {
			System.out.println("child windowid is" +h);
			driver.switchTo().window(h);
		}
	}
	WebElement cart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	cart.click();
	driver.switchTo().window(parentWindowId);
	WebElement apple2 = driver.findElement(By.xpath("//div[text()='REDMI 13C 5G (Startrail Silver, 256 GB)']"));
	apple2.click();
	Set<String> allWindowId2 = driver.getWindowHandles();
	List<String> li=new ArrayList();
	li.addAll(allWindowId2);
	String secondChildId = li.get(2);
	System.out.println("second child id is"+secondChildId);
	driver.switchTo().window(secondChildId);
	WebElement cart1 = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	cart1.click();
	
	
	
}
}