package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement UNtext = driver.findElement(By.name("txtUsername"));
	Thread.sleep(3000);
	UNtext.sendKeys("Admin");
	UNtext.clear();
	Thread.sleep(4000);
	WebElement PWDtext = driver.findElement(By.name("txtPassword"));
	PWDtext.sendKeys("admin123");
	PWDtext.clear();

}
}
