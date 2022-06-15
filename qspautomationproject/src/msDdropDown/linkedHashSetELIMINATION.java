package msDdropDown;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class linkedHashSetELIMINATION {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Karan/Desktop/Automation/MSDdropdown.html");
	WebElement dropdownEl=driver.findElement(By.id("MENU"));
	Select sel = new Select(dropdownEl);
	List<WebElement> options = sel.getOptions();
	
	LinkedHashSet<String>s=new LinkedHashSet<String>();
	
	for(int i=0;i<options.size();i++)
	{
		WebElement ops = options.get(i);
		String Text = ops.getText();
		s.add(Text);
	}
	
	for(String se:s)
	{
		System.out.println(se);
	}
}
}
