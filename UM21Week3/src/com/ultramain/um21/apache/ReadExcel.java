package com.ultramain.um21.apache;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Black
 * To read the data in the Excel file and print it in java application.
 */
public class ReadExcel {
	public static void main(String[] args) {
		readData();
	}

	/**
	 * to read the data in Excel file.
	 */
	public static void readData() {

		XSSFWorkbook wb=null;
		try {
			wb = new XSSFWorkbook(new FileInputStream(("C:\\Users\\Black\\Desktop\\sample.xlsx")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sh = wb.getSheet("sheet1");
		String str = sh.getRow(2).getCell(3).toString();
		System.out.println(str);
		int lastRow = sh.getLastRowNum();
		System.out.println("The Index of lost Row is : " + lastRow);
		int lastCol = sh.getRow(0).getLastCellNum();
		System.out.println("The Index of last col is : " + lastCol);
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < lastCol; j++) {
				String m = sh.getRow(i).getCell(j).toString();
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}