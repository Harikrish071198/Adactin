package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\Register\\src\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement forgetacc = driver.findElement(By.linkText("Forgotten password?"));
		forgetacc.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("harikrish98");
	}

}
