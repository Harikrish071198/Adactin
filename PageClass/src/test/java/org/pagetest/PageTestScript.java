package org.pagetest;

import java.io.IOException;

import org.page.BasePage;
import org.manager.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageTestScript extends BasePage {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		BasePage base = new BasePage();

		base.getDriver(base.readExcel(0, 1));

		base.LaunchUrl(base.readExcel(1, 1));

		base.winMax();

		PageManager pagemanager=new PageManager();
		
		WebElement user = pagemanager.getLoginpage().getUsername();
		
		base.sendKeysByJava(user, base.readExcel(2, 1));
		
		WebElement password = pagemanager.getLoginpage().getPassword();
		
		base.sendKeysJS(password, base.readExcel(3, 1));
		
		WebElement login = pagemanager.getLoginpage().getLogin();
		
		base.clickByJava(login); 
		
//		WebElement validateLogiPage = driver.findElement(By.xpath("//td[@class='login_title']"));
//
//		String text = validateLogiPage.getText();
//
//		System.out.println("launched the Adactin login page succesfully : " + text);
//
//		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
//
//		base.sendKeysByJava(username, base.readExcel(2, 1));
//
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//
//		base.sendKeysByJava(password, base.readExcel(3, 1));
//
//		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
//
//		base.clickByJS(login);
//
//		base.screenCapture();
//
//		WebElement validateSearchHotel = driver.findElement(By.xpath("//td[@class='login_title']"));
//
//		String text2 = validateSearchHotel.getText();
//
//		System.out.println(" search holtel logged successfully : " + text2);
//
//		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
//
//		base.selectByText(location, "Brisbane");
//
//		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
//
//		base.selectByvalue(hotels, "Hotel Sunshine");
//
//		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
//
//		base.selectByText(roomType, "Super Deluxe");
//
//		WebElement noOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
//
//		base.selectByText(noOfRooms, "3 - Three");
//
//		WebElement chechInDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//
//		Thread.sleep(2000);
//
//		base.sendKeysByJava(chechInDate, base.readExcel(9, 1));
//
//		WebElement checkOutDate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//
//		Thread.sleep(2000);
//
//		base.sendKeysByJava(checkOutDate, base.readExcel(10, 1));
//
//		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
//
//		base.selectByText(adultsPerRoom, "3 - Three");
//
//		WebElement childPerRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
//
//		base.selectByText(childPerRoom, "0 - None");
//
//		base.screenCapture();
//
//		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
//
//		base.clickByJS(search);
//
//		WebElement selectHotel = driver.findElement(By.xpath("//td[@class='login_title']"));
//
//		String text3 = selectHotel.getText();
//
//		System.out.println("logged into selectHotel : " + text3);
//
//		WebElement select = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
//
//		base.clickByJava(select);
//
//		WebElement clickContinue = driver.findElement(By.xpath("//input[@id='continue']"));
//
//		base.clickByJava(clickContinue);
//
//		WebElement bookHotel = driver.findElement(By.xpath("(//td[@class='login_title'])[2]"));
//
//		String text4 = bookHotel.getText();
//
//		System.out.println("logged into Book a Hotel page : " + text4);
//
//		WebElement scrolldown = driver.findElement(By.xpath("//td[text()='CVV Number']"));
//
//		base.scrollByJs(scrolldown, "Down");
//
//		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
//
//		base.sendKeysByJava(firstName, base.readExcel(4, 1));
//
//		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
//
//		base.sendKeysByJava(lastName, base.readExcel(5, 1));
//
//		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
//
//		base.sendKeysByJava(address, base.readExcel(8, 1));
//
//		WebElement creditCardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
//
//		base.sendKeysByJava(creditCardNo, base.readExcel(6, 1));
//
//		WebElement creditCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
//
//		base.selectByText(creditCardType, "VISA");
//
//		WebElement expiryMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//
//		base.selectByText(expiryMonth, "May");
//
//		WebElement expiryYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//
//		base.selectByText(expiryYear, "2029");
//
//		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
//
//		base.sendKeysByJava(cvv, base.readExcel(7, 1));
//
//		base.screenCapture();
//
//		WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
//
//		base.clickByJava(bookNow);
//
//		WebElement bookingConfirmation = driver.findElement(By.xpath("//td[@class='login_title']"));
//
//		String text5 = bookingConfirmation.getText();
//
//		System.out.println("Booking confirmation logged in successfully : " + text5);
//
//		base.sleep(5000);
//
//		WebElement IttineraryPage = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
//
//		base.clickByJS(IttineraryPage);
//
//		base.screenCapture();
//
//		WebElement selectOrder = driver.findElement(By.xpath("//input[@id='check_all']"));
//
//		base.clickByJS(selectOrder);
//
//		base.sleep(3000);
//
//		WebElement cancelOrder = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
//
//		base.clickByJS(cancelOrder);
//
//		base.handleAlert();
//
//		base.screenCapture();
//
//		WebElement bookIttinerary = driver.findElement(By.xpath("//td[@class='login_title']"));
//
//		String text6 = bookIttinerary.getText();
//
//		System.out.println("Book Ittinerary page logged in : " + text6);
//
//		WebElement logOutButton = driver.findElement(By.xpath("//input[@id='logout']"));
//
//		base.clickByJS(logOutButton);
//
//		WebElement logInButton = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
//
//		base.clickByJS(logInButton);
//
//		base.screenCapture();
	}
}
