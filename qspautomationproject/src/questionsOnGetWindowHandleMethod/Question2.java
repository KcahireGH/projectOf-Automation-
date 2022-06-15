package questionsOnGetWindowHandleMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("https://omayo.blogspot.com/");
	 driver.findElement(By.partialLinkText("Open a popup window")).click();
	 
	 Set<String> allHandles = driver.getWindowHandles();
	 
	 for(String wh:allHandles)
	 {
		 driver.switchTo().window(wh).close();
	 }
}
}
