package classone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Framework1 {

	public static void main(String[] args) throws IOException {
	
	File n=new File("C:\\Users\\ELCOT\\classone\\excel\\book1.xlsx");
	FileInputStream fin=new FileInputStream(n);
	
	Workbook w=new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("sheet1");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	
	System.out.println(cell);
	
	int cellType = cell.getCellType();	
		System.out.println(cellType);
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}
}
