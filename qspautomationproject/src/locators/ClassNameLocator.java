package locators;

import java.awt.KeyboardFocusManager;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
       public static void main(String[] args) throws InterruptedException {
    	   
    	   
    	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		  WebDriver driver=new ChromeDriver();
 		  driver.manage().window().maximize();
 		  driver.get("https://www.google.com");
 		  driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
 		  driver.findElement(By.className("lNPNe")).click();
 		  Thread.sleep(5000);
 		  driver.get("https://www.google.com");
 		  driver.switchTo().activeElement().sendKeys("thanos",Keys.ENTER);
 		  driver.findElement(By.id("dimg_1")).click();
 		  driver.findElement(By.className("gauntlet")).click();
	}
}
