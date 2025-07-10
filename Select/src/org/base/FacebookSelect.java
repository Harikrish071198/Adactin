package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harik\\eclipse-workspace\\Select\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement acc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	acc.click();
	Thread.sleep(2000);  
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(4);
	
	
	WebElement month = driver.findElement(By.id("month"));
	Select s1 =new Select(month);
	s1.selectByValue("11");
	
	List<WebElement> options = s1.getOptions();
	for(int i=0; i<options.size(); i++ ) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		
		
		
	}
		
}
}
