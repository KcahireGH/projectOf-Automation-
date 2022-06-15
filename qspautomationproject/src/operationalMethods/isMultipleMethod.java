package operationalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Karan/Desktop/Automation/MSDdropdown.html");
	WebElement dropdownElent=driver.findElement(By.id("MENU"));
	Select sel = new Select(dropdownElent);
    boolean StstusOfDD = sel.isMultiple();
    System.out.println(StstusOfDD);
}
}
