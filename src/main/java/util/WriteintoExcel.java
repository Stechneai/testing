package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExcel {

//	public static String write(String element) throws IOException {
//		String path = "E:\\EclipseNew\\EstimatePOS\\TT\\DemoFile.xlsx";
//		FileInputStream fs = new FileInputStream(path);
//		Workbook wb = new XSSFWorkbook(fs);
//		Sheet sheet1 = wb.getSheetAt(0);
//		int lastRow = sheet1.getLastRowNum();
//		for (int i = 0; i <= lastRow; i++) {
//			Row row = sheet1.getRow(0);
//			Cell cell = row.createCell(i);
//			
//			cell.setCellValue(element);
//		}
//
//		FileOutputStream fos = new FileOutputStream("E:\\EclipseNew\\EstimatePOS\\TT\\DemoFile.xlsx");
//		wb.write(fos);
//		fos.close();
//		System.out.println("Write into excel exicuted...");
//		return element;
//	}

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public void writeToExcel(String sheetName, int rownum, int colnum, String data) throws IOException {
		String path = "D:\\EclipseNew\\EstimatePOS\\TT\\DemoFile.xlsx";
		File fs = new File(path);
		if (!fs.exists()) {
			wb = new XSSFWorkbook();
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
		}
		FileInputStream fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		if (wb.getSheetIndex(sheetName) == -1)
			wb.createSheet(sheetName);
		sheet = wb.getSheet(sheetName);

		if (sheet.getRow(rownum) == null)
			sheet.createRow(rownum);
		row = sheet.getRow(rownum);

		cell = row.createCell(colnum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();

	}

}
