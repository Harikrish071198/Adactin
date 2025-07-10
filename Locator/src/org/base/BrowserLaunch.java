package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\BrowserLaunch1\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("harikrish07@");
WebElement password = driver.findElement(By.name("password"));
password.sendKeys("12567886");
WebElement adactin = driver.findElement(By.className("login_button"));
adactin.click();
}
}
