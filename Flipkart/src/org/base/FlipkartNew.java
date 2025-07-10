package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartNew {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.Chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Flipkart\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement mouse = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	Actions a =new Actions(driver);
	a.moveToElement(mouse).perform();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement secondover = driver.findElement(By.xpath("//a[text()='Living Room Furniture']"));
	a.moveToElement(secondover).perform();
	Thread.sleep(2000);
	WebElement click = driver.findElement(By.xpath("//a[text()='TV Units']"));
	a.click(click).perform();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	WebElement name = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	name.sendKeys("Harikrish");
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	pass.sendKeys("5678");
	WebElement login = driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
	login.click();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com/");
	driver.navigate().forward();
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("ajithsongs");
	Thread.sleep(2000);
	WebElement click2 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	click2.click();
	Thread.sleep(2000);
	
}
}
