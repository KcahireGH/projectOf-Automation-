package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2xpath {
       public static void main(String[] args) throws InterruptedException {
    	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		  WebDriver driver=new ChromeDriver();
 		  driver.manage().window().maximize();
 		  driver.get("https://www.twitter.com");
 		  Thread.sleep(3000);
 		  driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
 		  Thread.sleep(2000);
 		  driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Karan Ahire");
 		  Thread.sleep(2000);
 		  driver.findElement(By.xpath("//input[contains(@name,'phone_number')]")).sendKeys("7387422772");
 		  Thread.sleep(5000);
 		  driver.findElement(By.xpath("//select[contains(@id,'SELECTOR_1')]")).click();
 		  driver.findElement(By.xpath("//select[@id='SELECTOR_1']")).sendKeys("JUNE",Keys.ENTER);
  }
}
