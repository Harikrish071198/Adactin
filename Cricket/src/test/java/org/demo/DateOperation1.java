package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateOperation1 {
	
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\DateFormate.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook book=new XSSFWorkbook(stream);
	
	Sheet sheet = book.getSheet("Sheet1");
	
	Row row = sheet.getRow(1 );
	
	Cell cell = row.getCell(2);
	
	Date dateCellValue = cell.getDateCellValue();
	
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	
	String format = simpleDateFormat.format(dateCellValue);
	
	System.out.println(format);
}
}
