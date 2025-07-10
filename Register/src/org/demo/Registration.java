package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
public static void main(String[] args) {
	  System.setProperty( "WebDriver .chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Register\\src\\Driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	  name.sendKeys("harikrish");
	  WebElement lastname = driver.findElement( By.xpath("//input[@placeholder='Last Name']"));
	  lastname.sendKeys("G");
	  WebElement adress = driver.findElement(By.xpath("//textarea[@rows='3']"));
	  adress.sendKeys("234,near pillayar street alagapuram salem");
	  WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	  email.sendKeys("harikrish77@gmail");
	  WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
	  phoneno.sendKeys("98765678876");
	  WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
	  gender.click();
	  WebElement Hobbies = driver.findElement(By.xpath("//input[@type='checkbox']"));
	  Hobbies.click();
}
}
