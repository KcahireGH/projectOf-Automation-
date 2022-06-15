package dataDrivenFrameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
	public String readData(String Excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
	    Row row = sh.getRow(rowCount);
	    Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
		return data;
	}
	
	public int getRowCount(String Excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
		
	}

		
	public void writeExcelData(String Excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(Excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowCount);
			  
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(Excelpath);
		    wb.write(fos);
			
		}
	
	public String readPropertyFile(String propertypath,String key) throws IOException
	   {
		
		FileInputStream fis = new FileInputStream(propertypath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
		}
}
