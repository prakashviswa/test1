package org.exc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelChangeValues {

	public static void main(String[] args) throws IOException  {
		File excelLoc = new File("D:\\Users\\teslaram\\seleniumNewWork\\Information\\Excel\\excel3.xlsx");
		FileInputStream stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("happy");
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		String name = c.getStringCellValue();
		if (name.equals("prakashviswa@gmail.com")) {
			c.setCellValue("viswa@gmail.com");
		}
		FileOutputStream o = new FileOutputStream(excelLoc);
		w.write(o);
		System.out.println("Ok");

	}

}
