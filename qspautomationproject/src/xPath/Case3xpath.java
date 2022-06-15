package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3xpath {
       public static void main(String[] args) throws InterruptedException {
    	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		  WebDriver driver=new ChromeDriver();
 		  driver.manage().window().maximize();
 		  driver.get("https://opensource-demo.orangehrmlive.com/");
 		  driver.findElement(By.xpath("")).sendKeys("Admin");
 		  driver.findElement(By.xpath("")).sendKeys("admin123");
 		  Thread.sleep(5000);
 		  driver.findElement(By.xpath("")).click();
       }
}
