package org.dem;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Alerts\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	//simple
	
	WebElement click = driver.findElement(By.xpath("//button[@id='alertButton']"));
	click.click();
	Alert alerrt = driver.switchTo().alert();
	Thread.sleep(2000);
	alerrt.accept();
	//confirm
	
	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirm.click();
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	//
	WebElement name = driver.findElement(By.xpath("//button[@id='promtButton']"));
	name.click();
	
	Thread.sleep(2000);
	Alert alert2 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert2.sendKeys("harikrish");
	Thread.sleep(2000);
	alert2.accept();
}
}