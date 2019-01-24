package org.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {

	public static void main(String[] args) throws Exception  {
		File excelLoc = new File("D:\\Users\\teslaram\\seleniumNewWork\\Information\\Excel\\excelfile3.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("happy");
		Row r = s.createRow(4);
		Cell c = r.createCell(5);
		c.setCellValue("PrakashViswa");
		Row r1 = s.createRow(8);
		Cell c1 = r1.createCell(9);
		c1.setCellValue("G3Aadirai");
		
		FileOutputStream o = new FileOutputStream(excelLoc);
		w.write(o);
		System.out.println("ok");
		
	}
}
