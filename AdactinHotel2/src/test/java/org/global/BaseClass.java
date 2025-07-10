package org.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	JavascriptExecutor javascriptExecutor;

	TakesScreenshot takescreenshot;

	Select select;

	public void getDriver(String BrowserType) {

		switch (BrowserType) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			break;

		case "default":

			System.out.println("InvalidBrowserType");

			break;

		}
	}

	public void windowsMax() {

		driver.manage().window().maximize();
	}

	public void windowsMin() {
		driver.manage().window().minimize();

	}

	public void LaunchURL(String URL) {
		driver.get(URL);
	}

	public void sendKeysByJava(WebElement element, String KeysToSend) {
		element.sendKeys(KeysToSend);

	}

	public void sendKeysJS(WebElement element, String KeysToSend) {

		javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].setAttribute('value','" + KeysToSend + "')", element);

	}

	public void clickByJS(WebElement element) {

		javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].click()", element);

	}

	public void ClickByJava(WebElement element) {
		element.click();

	}

	public void screenCapture() throws IOException {

		takescreenshot = (TakesScreenshot) driver;

		File screenshotAs = takescreenshot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(
				"C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\AdactinNew" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(screenshotAs, targetFile);
	}

	public void selectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String value) {
		select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void sleep(long millis) throws InterruptedException {

		Thread.sleep(millis);

	}

	public String readExcel(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\harik\\OneDrive\\AdactinHotel2.xlsx ");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Adactinsheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value = null;

		switch (cellType) {
		case STRING:

			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
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

	public void scrollByJS(WebElement element, String scrollType) {

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

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}
