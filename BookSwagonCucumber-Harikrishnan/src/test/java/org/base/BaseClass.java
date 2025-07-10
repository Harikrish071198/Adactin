package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static JavascriptExecutor javascriptExecutor;

	public static TakesScreenshot takesScreenshot;

	public static Select select;

	public static Actions actions;

	public static Robot robot;
	
	public static Cell cell;
	
	public static Row row;
	
	public static Alert alert;

	public static void getDriver(String BrowserType) {

		switch (BrowserType) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			break;
		default:

			System.out.println("Ivalid_BrowserType");

			break;
		}
	}

	public void winMax() {

		driver.manage().window().maximize();

	}

	public void LaunchUrl(String BrowserUrl) {

		driver.get(BrowserUrl);

	}

	public void sendKeysByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);

	}

	public void sendKeysJS(WebElement element, String KeysToSend) {

		javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].setAttribute('value','" + KeysToSend + "')", element);

	}

	public void clickByJS(WebElement element) {

		javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].click()", element);

	}

	public void clickByJava(WebElement element) {

		element.click();

	}

	public void screenCapture() throws IOException {

		takesScreenshot = (TakesScreenshot) driver;

		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);

		File targetFile = new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\errorimage\\"
				+ System.currentTimeMillis() + ".png");

		FileUtils.copyFile(screenshotAs, targetFile);

	}

	public void selectByvalue(WebElement element, String value) {

		select = new Select(element);

		select.selectByValue(value);

	}

	public void selectByText(WebElement element, String text) {

		select = new Select(element);

		select.selectByVisibleText(text);
	}

	public void sleep(long millis) throws InterruptedException {

		Thread.sleep(millis);

	}

	public String readExcel(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Projects\\Bookswag.xlsx");

		FileInputStream fileInputstream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputstream);

		Sheet sheet = workbook.getSheet("Sheet1");

		 row = sheet.getRow(rownum);

		 cell = row.getCell(cellnum);

		CellType cellType = cell.getCellType();

		String value = null;

		switch (cellType) {

		case STRING:

			value = cell.getStringCellValue();

			break;
		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

				value = simpleDateFormat.format(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();

				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);

				value = valueOf.toString();

			}
			break;

		default:

			System.out.println("Invalid");

			break;
		}
		return value;

	}

	public void scrollByJs(WebElement element, String scrollType) {

		javascriptExecutor = (JavascriptExecutor) driver;

		switch (scrollType) {
		case "UP":

			javascriptExecutor.executeScript("arguments[0].scrollIntoView(false)", element);
			break;

		case "Down":

			javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
			break;

		default:

			System.out.println("Invalid_scrollType");
			break;
		}

	}

	public void handleAlert() {

		 alert = driver.switchTo().alert();

		alert.accept();
	}

	public void actionDragAndDrop(WebElement source, WebElement target) {

		actions = new Actions(driver);

		actions.dragAndDrop(source, target).build().perform();

	}

	public void ClickByActions(WebElement element) {
		actions = new Actions(driver);
		element.click();

	}

	public void DoubleClickByActions(WebElement element) {
		actions = new Actions(driver);
		actions.doubleClick().perform();
		

	}

	public void RightClickByActions(WebElement element) {
		actions = new Actions(driver);
		actions.contextClick(element).perform();
		

	}

	public void MouseHover(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
		

	}

	public void windowsHandling(int childWindowIndex) {

		String parentWindowsID = driver.getWindowHandle();

		Set<String> allWindowsID = driver.getWindowHandles();

		// To create empty List
		List<String> list = new LinkedList<>();

		// Add all the set value(WIndowsId) into List
		list.addAll(allWindowsID);

		// To get Required ChildWindows Id based on index
		String childWindowsID = list.get(childWindowIndex);
		// To switch to required windows
		driver.switchTo().window(childWindowsID);

	}

	public void switchToWindows(String childWindowsID) {
		driver.switchTo().window(childWindowsID);
	}

	public String getWindowsID(int childWindowsIndex) {

		String ParentWindowsID = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		List<String> list = new LinkedList<String>();

		// Add all the set value(WindowsID) based on Index
		String childWindowsId = list.get(childWindowsIndex);

		return childWindowsId;
	}

	public void Navigation(String commands) {
		switch (commands) {

		case "refresh":
			driver.navigate().refresh();
			break;

		case "forward":

			driver.navigate().forward();

		case "back":

			driver.navigate().back();
			break;

		default:
			System.out.println("Invalid_commands");
			break;

		}

	}

	public void clickByRobot() throws AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

	}
}
