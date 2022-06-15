package getWindowHandleMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartGetWindowHandleMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.className("_3704LK")).sendKeys("samsung f12");
	driver.findElement(By.className("L0Z3Pu")).click();
	String parentHandle = driver.getWindowHandle();
	System.out.println(parentHandle);
	driver.findElement(By.className("_4rR01T")).click();
	driver.findElement(By.xpath("//li[@id='swatch-0-color']/a")).click();
	//driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::ul[@class='_1q8vHb']")).click();
	
	
	
	
	
	
	
	}
}