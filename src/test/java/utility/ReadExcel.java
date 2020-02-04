package utility;

public class ReadExcel {


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.google.common.collect.Table.Cell;

public class ReadExcel {

	public static String[][] getData(String fileName, String sheetName) throws IOException {
		File file = new File(fileName);
		FileInputStream ips = new FileInputStream(file);
		// Workbook Wb = new XSSFWorkbook(ips);
		Workbook Wb = new HSSFWorkbook(ips);
		Sheet Sh = Wb.getSheet(sheetName);
		int rowNum = Sh.getLastRowNum() + 1;
		int colNum = Sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowNum][colNum];
		for (int i = 0; i < rowNum; i++) {
			Row row = Sh.getRow(i);
			for (int j = 0; j < colNum; j++) {
				Cell cell = row.getCell(j);
				String value = new DataFormatter().formatCellValue(cell);
				data[i][j] = value;
			}
		}
		Wb.close();
		return data;
		
		
	}


}


