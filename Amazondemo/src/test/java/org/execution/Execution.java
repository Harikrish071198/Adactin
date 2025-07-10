package org.execution;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		Thread.sleep(4000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	}

}
