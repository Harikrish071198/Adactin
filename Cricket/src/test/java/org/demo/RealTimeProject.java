package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeProject {
	public static WebDriver driver;

	public void getDriver(String BrowserType) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void LaunchUrl(String BrowserUrl) {
		driver.get(BrowserUrl);

	}

	public String readExcel(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\AdactinProject.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		switch (cellType) {

		case STRING:
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

				String format = simpleDateFormat.format(dateCellValue);

				System.out.println(format);

			} else {

				double numericCellValue = cell.getNumericCellValue();

				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);

				System.out.println(valueOf);

			}
			break;

		default:
			System.out.println("In_valid_cellType");
			break;
			
		}
		return null;

	}

	
}
