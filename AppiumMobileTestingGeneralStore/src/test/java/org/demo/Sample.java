package org.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		//code to start the server
		AppiumDriverLocalService build = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\harik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//code 
		
		build.start();
		
		UiAutomator2Options uiAutomator2Options=new UiAutomator2Options();
		
		uiAutomator2Options.setCapability("devicename", "Hari");
		uiAutomator2Options.setCapability("app","C:\\Users\\harik\\eclipse-workspace\\AppiumMobileTestingGeneralStore\\src\\test\\resources\\General-Store.apk");
		uiAutomator2Options.setCapability("browserName", "Chrome");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),uiAutomator2Options);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//dropdown
		  
		WebElement dropDown = driver.findElement(By.id("android:id/text1"));
		dropDown.click();
		
		//scroll 
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		
		WebElement india = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"India\"]"));
		india.click();
		
		WebElement textBox = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]"));
		textBox.sendKeys("Hari");
		
		WebElement letsShop = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]"));
		letsShop.click();
		
		Thread.sleep(3000);
		
		WebElement addCart1 = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]"));
		addCart1.click();
		
		Thread.sleep(2000);
		
		WebElement cartPage = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.androidsample.generalstore:id/toolbar\"]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout"));
		cartPage.click();
		
		Thread.sleep(2000);
		
		WebElement clickbox = driver.findElement(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]"));
		clickbox.click();
		
		Thread.sleep(2000);
		
		WebElement visitWebsite = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnProceed\"]"));
		visitWebsite.click();
		
		//WebElement toastMsg = driver.findElement(By.xpath("//android.widget.Toast"));
		//String attribute = toastMsg.getAttribute("name");
		//System.out.println(attribute);
		
		Thread.sleep(15000);
		
		Set<String> contextHandles = driver.getContextHandles();
		List<String> allTabs=new ArrayList();
		allTabs.addAll(contextHandles);
		System.out.println(allTabs);
		
		//switch to control
		driver.context(allTabs.get(1));
		
		WebElement textbox = driver.findElement(By.xpath("//textarea[@name='q']"));
		textbox.sendKeys("Applicstion \n");
		
		//textBox.submit();
		
		Thread.sleep(3000);
		driver.context("NATIVE APP");
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		Thread.sleep(3000);
		
		driver.quit();
		
		build.stop();
	}
}
