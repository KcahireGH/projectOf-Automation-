package automationRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleOperation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.flipkart.com/");
//    driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("7387422772");
//    driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("Kcahire@4607");
//    driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
    driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
    Thread.sleep(4000);
    
    driver.findElement(By.className("_3704LK")).sendKeys("iphone 13 pro");
    driver.findElement(By.xpath("//div[.='APPLE iPhone 13 Pro (Gold, 1 TB)']")).click();
    
    
    
    
}
}
