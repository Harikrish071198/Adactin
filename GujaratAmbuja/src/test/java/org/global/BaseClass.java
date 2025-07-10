package org.global;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public AppiumDriverLocalService service;
	public UiAutomator2Options options;
	public AndroidDriver driver;
	
	@BeforeClass
	public void startAppium() throws MalformedURLException, Throwable {
		 service = new AppiumServiceBuilder()
		 .withAppiumJS(new File("C:\\Users\\harik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		 .withIPAddress("127.0.0.1")
	     .usingPort(4723)
		.build();
		 service.start();
		 System.out.println("Appium started");
	
		 options = new UiAutomator2Options();
		 options.setDeviceName("Hari");
		 //options.setApp("C:\\Users\\harik\\eclipse-workspace\\Appium\\src\\test\\resources\\ApiDemos-debug.apk");
		 options.setApp("C:\\Users\\harik\\eclipse-workspace\\GujaratAmbuja\\src\\test\\resources\\GujaratAmbuja.apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 System.out.println("Driver initialized");
}
	
	public void longPressAaction(WebElement longClick) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longClick).getId(), "duration", 2000));
		

	}
	
	public void scrollToEndAction() {
		boolean canScrollMore;
		do
		{
			canScrollMore= (Boolean)  ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture",ImmutableMap.of("left", 100, "top", 100 ,"width", 200 , "height", 200 , "direction", "down", "percent", 3.0));
		
		}while(canScrollMore);

	}
	
	public void swipeAction(WebElement ele,String direction) {
		((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));

	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}

	
	