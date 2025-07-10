  package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BrowserLaunch {
	public static WebDriver driver;
	private static void screenshot(String name) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 //defaultlocation
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			//desired location
			File targetfile=new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\"+name+".jpeg");
			FileUtils.copyFile(srcfile,targetfile);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:  \\Users\\harik\\eclipse-workspace\\TypeCasting\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://greenstech.in/");
	driver.manage().window().maximize();
	screenshot("greens");
	
	driver.navigate().to("https://www.flipkart.com/");
	
	 screenshot("flipkart");
}
}


