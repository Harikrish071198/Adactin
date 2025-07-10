package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("realme mobile 5g",Keys.ENTER);
	List<WebElement> name = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	for(WebElement h:name) {
		String text = h.getText();
		System.out.println(text);
	}
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	for(WebElement k:price) {
		String text2 = k.getText();
		System.out.println(text2);
	}
}
}
