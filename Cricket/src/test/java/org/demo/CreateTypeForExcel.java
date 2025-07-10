package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateTypeForExcel {
	
public static void main(String[] args) throws IOException {
	
	File file =new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\karthi.xlsx");
	
	Workbook book =new XSSFWorkbook();
	
	Sheet createSheet = book.createSheet("emailId");
	
	Row createRow = createSheet.createRow(0);
	
	Cell createCell = createRow.createCell(1);
	
	Row createRow1 = createSheet.createRow(5);
	
	Cell createCell1 = createRow1.createCell(3);
	
	createCell.setCellValue("harikrishpc07@gmail.com");
	
	createCell1.setCellValue("krishpc07@gmail.com");
	
	FileOutputStream stream=new FileOutputStream(file);
	
	book.write(stream);
}
}
