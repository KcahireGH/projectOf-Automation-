import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("");
	
	FileInputStream fis = new FileInputStream("./data/ActitimeLogInCreds.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("validcreds");
	Row row = sh.getRow(1);
	Cell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	System.out.println(data);
	
	
	 FileInputStream fis2 = new FileInputStream("./data/ActitimeLogInCreds.xlsx");
	 Workbook wb2 = WorkbookFactory.create(fis2);
	 Sheet sh2 = wb2.getSheet("validcreds");
	 Row row2 = sh2.getRow(1);
	 Cell cell2 = row2.getCell(1);
	 String data2 = cell2.getStringCellValue();
	 System.out.println(data2);
	 
	driver.findElement(By.name("")).sendKeys(data);
	driver.findElement(By.name("")).sendKeys(data2);
	driver.findElement(By.id("")).click();
}
}

