package org.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample2Chromedriver {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// code to start the server
		AppiumDriverLocalService build = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\harik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		// code

		build.start();

		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();

		uiAutomator2Options.setCapability("devicename", "Hari");
		uiAutomator2Options.setChromedriverExecutable(
				"C:\\Users\\harik\\eclipse-workspace\\AppiumMobileTestingGeneralStore\\src\\test\\resources\\chromedriver_win32.zip");
		uiAutomator2Options.setCapability("browserName", "Chrome");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), uiAutomator2Options);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(3000);
		// Driver close
		driver.quit();
	}
}
