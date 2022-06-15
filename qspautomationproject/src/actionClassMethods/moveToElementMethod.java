package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(5000);
WebElement TargetMouseHover = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
	Actions act = new Actions(driver);
	act.moveToElement(TargetMouseHover).perform();
}
}
