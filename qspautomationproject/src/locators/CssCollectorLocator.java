package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v98.page.model.BackForwardCacheNotRestoredReason;

public class CssCollectorLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		

	}

}
