package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\BrowserLaunch1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement google = driver.findElement(By.id("APjFqb"));
	google.sendKeys("greens technology");
	WebElement search = driver.findElement(By.name("btnK"));
	search.click();
 
}}
