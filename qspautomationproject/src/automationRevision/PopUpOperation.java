package automationRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpOperation {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://demoqa.com/alerts");
    
    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    Thread.sleep(5000);
    Alert a1 = driver.switchTo().alert();
    a1.dismiss();
    
    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
    Thread.sleep(5000);
    Alert a2 = driver.switchTo().alert();
    a2.dismiss();
    
    
  }
}
