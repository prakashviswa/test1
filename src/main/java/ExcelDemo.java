import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		File exLoc = new File("D:\\Users\\teslaram\\seleniumNewWork\\Information\\Excel\\EXDATA.xlsx");
		FileInputStream str = new FileInputStream(exLoc);
		Workbook w = new XSSFWorkbook(str);
		Sheet s = w.getSheet("dat");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			System.out.println();
		}
	}
}
