package com.sample.java.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel{
	
	public static void main(String[] orgs) {
		readXLSXFile("/Users/avinashkumar/eclipse-workspace/sample.java.practice/DataFiles/devices.xlsx");
	}

	private static void readXLSXFile(String file) {
		
		try {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(file));
			
			XSSFSheet sheet=wb.getSheet("Devices");
			
			XSSFRow row=null;
			
			int i=0;
			while((row=sheet.getRow(i))!=null) {
				System.out.print(row.getCell(0).getStringCellValue()+"  ");
				System.out.print(row.getCell(1));
			    System.out.println();
				i++;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
   
}
