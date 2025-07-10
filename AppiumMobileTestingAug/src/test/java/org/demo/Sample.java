package org.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// code to Start the server

		AppiumDriverLocalService build = new AppiumServiceBuilder()
				.withAppiumJS(
						new File(" "))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		// to start the server
		build.start();

		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
		uiAutomator2Options.setCapability("devicename", "Hari");
		uiAutomator2Options.setCapability("app",
				"C:\\Users\\harik\\eclipse-workspace\\AppiumMobileTestingAug\\src\\test\\resources\\ApiDemos-debug.apk");

		// App Package and App Activity
		// io.appium.android.apis/io.appium.android.apis.view.AutoComplete1

		// uiAutomator2Options.setCapability("appPackage", "io.appium.android.apis");
		// uiAutomator2Options.setCapability("appActivity",
		// "io.appium.android.apis.view.AutoComplete1");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), uiAutomator2Options);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// locate the vies element
		// selenium locator -id,classname,xpath - by.
		// Appium Locator-accID,androidUi-AppiumBy.

		WebElement viewElements = driver.findElement(AppiumBy.accessibilityId("Views"));
		viewElements.click();
		Thread.sleep(1000);
		WebElement drag = driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
		drag.click();
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("mobile:dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) drag1).getId(), "endX", 204, "endY", 970));
//
//		WebElement complete = driver.findElement(AppiumBy.accessibilityId("Auto Complete"));
//		complete.click();
//
//		WebElement screen = driver.findElement(AppiumBy.accessibilityId("1. Screen Top"));
//		screen.click();
//		
		// WebElement textBox =
		// driver.findElement(By.className("//*[@android.widget.AutoCompleteTextView"));
		// passing the text to the clipboard

		// driver.setClipboardText("India");
		// to enter the text
		// textBox.sendKeys(driver.getClipboardText());

		Thread.sleep(3000);

		// DeviceRotation deviceRotation=new DeviceRotation(0,0,90);
		// driver.rotate(deviceRotation);
		// Thread.sleep(3000);
		// press back key
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);

		WebElement gallary = driver.findElement(AppiumBy.accessibilityId("Gallery"));
		gallary.click();

		WebElement photo = driver.findElement(AppiumBy.accessibilityId("1. Photos"));
		photo.click();

		Thread.sleep(3000);

		WebElement secondImage = driver.findElement(By.xpath(
				"//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));

		Thread.sleep(3000);

		js.executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) secondImage).getId(), "direction", "left", "percent", 0.75));

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"));"));

		Thread.sleep(3000);
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Expandable Lists\"));"));

		Thread.sleep(3000);
		
		WebElement exp = driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
		exp.click();
		
		Thread.sleep(2000);
		
		WebElement custom = driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
		custom.click();
		
		Thread.sleep(2000);
		
		WebElement peoplesName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		Thread.sleep(2000);
		
		js.executeScript("mobile:longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)peoplesName).getId(),"duration",2000));
		
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		// press Home key
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		Thread.sleep(3000);
		// driver close
		driver.quit();

		// to stop the server
		build.stop();
	}
}
