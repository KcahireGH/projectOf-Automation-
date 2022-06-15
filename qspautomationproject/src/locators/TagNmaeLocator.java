package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNmaeLocator {
 public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://opensource-demo.orangehrmlive.com/");
  Thread.sleep(5000);
  driver.findElement(By.tagName("input")).sendKeys("Admin");
  Thread.sleep(3000);
}
}
