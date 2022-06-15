package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdev {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev");
	driver.findElement(By.xpath("//span[.='Downloads']")).click();
	//driver.findElement(By.xpath("//p[.='Java']/ancestor::div[@class='card-body px-0 text-center']/descendant::a[.='API Docs']")).click();
	driver.findElement(By.xpath("(//a[.='API Docs'])[3]")).click();	// by using index value
}
}
