package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement UNtext = driver.findElement(By.name("txtUsername"));
	WebElement PWDtext = driver.findElement(By.name("txtPassword"));
          String value1 = UNtext.getAttribute("type");
          String value2 = PWDtext.getAttribute("id");

          System.out.println(value1);

          System.out.println(value2);

}
}
