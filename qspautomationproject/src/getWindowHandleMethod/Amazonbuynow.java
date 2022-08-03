package getWindowHandleMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonbuynow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	driver.findElement(By.xpath("(//span[.='Apple iPhone 13 Pro (128GB) - Sierra Blue'])[1]")).click();
	Thread.sleep(5000);
	
	String parentHandle = driver.getWindowHandle();
	Set<String> allHandle = driver.getWindowHandles();
	for(String wh:allHandle)
	{
		if (!parentHandle.equals(wh)) {
			{
				driver.switchTo().window(wh);
			}
			
			
		}
	}
	driver.findElement(By.id("buy-now-button")).click();
	
}
}
