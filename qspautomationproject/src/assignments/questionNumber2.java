package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class questionNumber2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ahirek759@gmail.com");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	
     

}
}
