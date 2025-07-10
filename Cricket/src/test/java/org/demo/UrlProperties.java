package org.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlProperties {

	public static void main(String[] args) throws IOException {
		   
		Properties prop=new Properties();
		
		FileReader reader=new FileReader("C:\\Users\\harik\\eclipse-workspace\\Cricket\\DataBase\\config.properties");
		
		prop.load(reader);
		
		Object object = prop.get("url");
		
		System.out.println(object);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
	}
}
