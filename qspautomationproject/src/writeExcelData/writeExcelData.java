package writeExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcelData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream fis = new FileInputStream("./data/ActitimeLogInCreds.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("validcreds");
	Row row = sh.getRow(1);
	
	Cell cell = row.createCell(2);
	cell.setCellValue("Status");
	
	FileOutputStream fos = new FileOutputStream("./data/ActitimeLogInCreds.xlsx");
	wb.write(fos);
}
}
