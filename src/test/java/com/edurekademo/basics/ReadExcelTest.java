package com.edurekademo.basics;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.zip.DataFormatException;

	import com.google.common.collect.Table.Cell;
    import com.sun.rowset.internal.Row;

	public class ReadExcelTest {

		public static <Workbook> String[][] getData(String fileName, String sheetName) throws IOException {
			File file = new File(fileName);
			FileInputStream ips = new FileInputStream(file);
			// Workbook Wb = new XSSFWorkbook(ips);
			Workbook Wb = new Workbook(ips);
			short Sh = (Wb).getSheet(sheetName);
			int rowNum = Sh.getLastRowNum() + 1;
			int colNum = Sh.getRow(0).getLastCellNum();
			String[][] data = new String[rowNum][colNum];
			for (int i = 0; i < rowNum; i++) {
				Row row = Sh.getRow(i);
				for (int j = 0; j < colNum; j++) {
					Cell cell = row.getCell(j);
					String value = new DataFormatException().formatCellValue(cell);
					data[i][j] = value;
				}
			}
			Wb.close();
			return data;
			
			
		}


	}


