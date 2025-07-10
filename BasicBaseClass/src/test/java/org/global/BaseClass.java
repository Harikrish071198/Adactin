package org.global;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static JavascriptExecutor javascriptExecutor;
	
	public static Select select;
	
	public static void getDriver(String BrowserType) {
		
		switch(BrowserType) {
		case"chrome":
		
		WebDriverManager.chromedriver().setup();
		
         driver=new ChromeDriver();
         
         break;
         
		case"Edge":
			
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
       
			break;
			
			default:
				System.out.println("InValid_BrowserType");
				
				break;
		}    
	}
	public void winMax() {
		
		driver.manage().window().maximize();
	}
	
	public void launchUrl(String BrowserUrl) {
		
		driver.get(BrowserUrl);
		
	}
	public void senKeysByJava(WebElement element ,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	
	public void sendKeysByJS(WebElement element ,String keysTosend) {
		javascriptExecutor =(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+keysTosend+"')",element);

	}
	public void clickByJS(WebElement element) {
		javascriptExecutor =(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click()", element);
		

	}
	public void scrollByJS(WebElement element ,String scrollType) {
		
switch(scrollType) {
case"Up":
	javascriptExecutor.executeScript("arguments[0].scrollIntoView(false)", element);
	
	break;
	
case"Down":
	
	javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
	
	break;
	
	default:
		
		System.out.println("InValid_scrollType");
		
		break;
		
}
	}
	private void windowsHandling(int childWindowIndex) {
		
		String parentWindowsID = driver.getWindowHandle();
		
		Set<String> allWindowsID = driver.getWindowHandles();
		
		//to create empty list
		List<String> list=new LinkedList<String>();
		
		//ADD all set to List
		list.addAll(allWindowsID);
		
		//TO get the required ChildWindowsID based on Index
		
		String childWindowsID = list.get(childWindowIndex);
		
		//to switch to required Index
		
		driver.switchTo().window(childWindowsID);
		
	}
	
	public String getWindowsID(int childWindowsIndex) {
		
		String parentWindowsID = driver.getWindowHandle();
		
		Set<String> allWindowsID = driver.getWindowHandles();
		
		// to create Empty list
		List<String> list=new LinkedList<String>();
		
		//Add all the set value (windowID)into List
		
		list.addAll(allWindowsID);
		
		// to get Required ChildWindowsID based on Index
		
		String childWindowsID = list.get(childWindowsIndex);
		
		return childWindowsID;
		
	}
	public void switchToWindows(String childWindowsID) {
		 driver.switchTo().window(childWindowsID);
	}
	
	private void clickByJava(WebElement element) {
		element.click();

	}
	
	private void screenCapture() throws IOException {
		
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
		
		File screenshotAs = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		File targetFile=new File("C:\\Users\\harik\\eclipse-workspace\\BasicBaseClass\\ErrorImage\\"+System.currentTimeMillis()+".jpeg");
		
		FileUtils.copyFile(screenshotAs, targetFile);
	}
	
	private void navigation(String commands) {
		
		switch(commands) {
		
		case"refresh":
		
		driver.navigate().refresh();
		
		break;
		
		case"forward":
			
			driver.navigate().forward();
		
			break;
			
		case"back":
			
			driver.navigate().back();
			
			break;
			
			default:
				
				System.out.println("Invalid_commands");
				
				break;
		}

	}
	private void selectByValue(WebElement element, String value) {
		
		select =new Select(element);
		
		select.selectByValue(value);

	}
	
	private void selectBytext(WebElement element , String text) {
		
select=new Select(element);

select.selectByVisibleText(text);
	}
	
	public void sleep(long millis) throws InterruptedException{
		
	
	
	Thread.sleep(millis);
}
}