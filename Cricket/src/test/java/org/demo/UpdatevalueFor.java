package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

public class UpdatevalueFor {
	
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\DateFormate.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook book=new XSSFWorkbook(stream);
	
	Sheet sheet = book.getSheet("Sheet1");
	
	for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for(int j=0;j<row.getPhysicalNumberOfCells();j++){
			
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING:
				
				String stringCellValue = cell.getStringCellValue();
				
				if(stringCellValue.equals("karthi")) {
					
					cell.setCellValue("Harikrish");
					
					FileOutputStream stream2 =new FileOutputStream(file);
					
					book.write(stream2);}
			
				String stringCellValue2 = cell.getStringCellValue();
				System.out.println(stringCellValue+" ");
			
				break;
					
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						
						Date dateCellValue = cell.getDateCellValue();
						
						SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
						
						String format = simpleDateFormat.format(dateCellValue);
						
						System.out.println(" "+format);
						
					}
					else {
						double numericCellValue = cell.getNumericCellValue();
						
						BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
						
						String string = valueOf.toString();
						
						System.out.println(string+" ");
						break;
					}
					default:
						System.out.println("input_invalid");
						break;
			}
			
		}
		System.out.println();
	}
}
}
