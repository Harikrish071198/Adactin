package org.dem;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\WindowsHandle\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
search.sendKeys("sonytv",Keys.ENTER);
WebElement sonytv1 = driver.findElement(By.xpath("//div[text()='SONY 80 cm (32 inch) HD Ready LED Smart Google TV 2024 Edition']"));
sonytv1.click();
//windowshandle
String parent = driver.getWindowHandle();
System.out.println("parent window Id is"+parent);
Set<String> childWindow = driver.getWindowHandles();
for(String h:childWindow) {
	if(!parent.equals(h)) {
		System.out.println("child window Id is"+h);
		driver.switchTo().window(h);
		
	}
}
WebElement cart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
cart.click();
driver.switchTo().window(parent);
WebElement search2 = driver.findElement(By.xpath("//div[text()='SONY Bravia X82L 163.9 cm (65 inch) Ultra HD (4K) LED Smart Google TV']"));
search2.click();
Set<String> child2 = driver.getWindowHandles();
List<String> li=new ArrayList();
li.addAll(child2);
String secondChild = li.get(2);
System.out.println("second child is"+secondChild);
driver.switchTo().window(secondChild);
WebElement cart1= driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
cart1.click();
driver.switchTo().window(parent);
WebElement search3 = driver.findElement(By.xpath("//div[text()='SONY Bravia X64L 108 cm (43 inch) Ultra HD (4K) LED Smart Google TV']"));
search3.click();
Set<String> child3 = driver.getWindowHandles();
List<String> lis=new ArrayList();
li.addAll(child3);
String thirdChild = li.get(3);
System.out.println("thirdChild is"+thirdChild);
driver.switchTo().window(thirdChild);
WebElement cart3= driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
cart3.click();
 
}
}
