package com.qa.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFile {

	public static void main(String[] args) {
		
		File f=new File("D:\\\\eclipse-workspace\\\\Oct2021SeleniumSessions\\\\Test.xlsx");
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			 fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		}
		
		try {
			 wb=WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
						e.printStackTrace();
		} catch (IOException e) {
						e.printStackTrace();
		}
		
	org.apache.poi.ss.usermodel.Sheet sheet=wb.getSheet("sheet1");
	Row r=sheet.getRow(0);
	int cellNUm=r.getLastCellNum();
	System.out.println(cellNUm);
	
	for (int i = 0; i < cellNUm; i++) {
		System.out.print(r.getCell(i)+"\t");
		
	}
	}
}
