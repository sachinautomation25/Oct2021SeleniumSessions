package com.qa.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {

	public static void main(String[] args) {

		// 1 create excel workbook .xlsx

		XSSFWorkbook workbook = new XSSFWorkbook();

		// 2. create sheet in the workbook
		XSSFSheet sheet = workbook.createSheet("sheet1");

		// 3.create row in sheet
		XSSFRow row1 = sheet.createRow(0);

		// 4. create cell or column in first row
		XSSFCell cell1 = row1.createCell(0);
		XSSFCell cell2 = row1.createCell(1);
		XSSFCell cell3 = row1.createCell(2);

		// 4. insert values in the cell
		cell1.setCellValue("Name");
		cell2.setCellValue("Email");
		cell3.setCellValue("Mobile");

		File f = new File("D:\\eclipse-workspace\\Oct2021SeleniumSessions\\Test.xlsx");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
						e.printStackTrace();
		}
		System.out.println("file created");
	}
}
