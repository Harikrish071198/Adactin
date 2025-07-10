package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateOperation {
	
public static void main(String[] args) throws IOException {
	
	File file =new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\DateFormate.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook book=new XSSFWorkbook(stream);
	
	Sheet sheet = book.getSheet("Sheet1");
	
	Row row = sheet.getRow(4);
	
	Cell cell = row.getCell(1);
	
	double numericCellValue = cell.getNumericCellValue();
	
    BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
	
	String string = valueOf.toString();
	
	
	System.out.println(string);
	
}

}
