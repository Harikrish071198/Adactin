package org.demo;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestScript {
public static void main(String[] args) throws IOException {
	 
	//to locate where the excel (workbook) will be there
	File file= new File("C:\\Users\\harik\\Music\\EXCEL\\Frame1stDay.xlsx");
	
	//to get file data
	FileInputStream stream=new FileInputStream(file);
	
	//to define workbook format
	Workbook book =new XSSFWorkbook(stream);
	
	//to get sheet from excel workbook
	Sheet sheet = book.getSheet("Sheet1");
	
	//to get row from sheet
	Row row = sheet.getRow(1);
	
	//to get cell from row
	 Cell cell = row.getCell(0);
	 
	 //to get the string value from cell
	 String stringCellValue = cell.getStringCellValue();
	 System.out.println(stringCellValue);
}

}
