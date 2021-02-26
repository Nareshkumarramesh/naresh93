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

public class Datadriven {
	public static void main(String[] args) throws IOException {
	
		File f = new File("C:\\Users\\ELCOT\\classone\\Excel\\datas.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet1 = w.getSheet("sheet 1");
		Row row = sheet1.getRow(0);
		Cell cell = row.getCell(1);
				
		System.out.println(cell);
	
		
	}
}
