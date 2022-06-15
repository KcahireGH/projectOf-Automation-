package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.className("_3SkBxJ")).click();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
	driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("karan@123");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@456");
	driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
	
}
}
