package  org.demo;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MatchScores {
public static void main(String[] args) throws InterruptedException  {
WebDriverManager.chromedriver().setup();
Thread.sleep(2000);
WebDriver driver=new ChromeDriver();
//
driver.get("https://www.amazon.in/");

driver.manage().window().maximize();
 WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("iphone15 promax",Keys.ENTER);
List<WebElement> iphonelist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

for (int i = 0; i < iphonelist.size(); i++) {
	
	WebElement phonename = iphonelist.get(i);
	  
	String text = phonename.getText();
	
	WebElement price = pricelist.get(i);
	
	String text2 = price.getText();
	
	System.out.println("phonename : "+text +" " +"Pricelist :"+text2);
}

}
}
 