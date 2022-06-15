package operationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Karan/Desktop/Automation/MSDdropdown.html");
		WebElement dropdownElement = driver.findElement(By.id("MENU"));
	   Select sel = new Select(dropdownElement);
	   List<WebElement> Options = sel.getOptions();
	   
	   for(int i=0;i<Options.size();i++)
	   {
		   WebElement opt = Options.get(i);
		   String Value = opt.getText();
		   System.out.println(Value);
	   }

	}

}
