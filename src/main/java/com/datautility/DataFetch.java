package com.datautility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFetch {
	public String fetchpro(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\\\onlineBatch\\\\key.PROPERTIES");
		Properties pobj =new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
		
	}
	public String FetchExcelData(String SheetName,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream("");
		Workbook book=WorkbookFactory.create(fis);
		DataFormatter format=new DataFormatter();
		return format.formatCellValue(book.getSheet(SheetName).getRow(row).getCell(cell));
		
	}
}
