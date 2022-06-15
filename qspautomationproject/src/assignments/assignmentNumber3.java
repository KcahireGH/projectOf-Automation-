package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignmentNumber3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.jqueryui.com/droppable/webpage");
	driver.findElement(By.xpath("//a[.='Demos']")).click();
	driver.findElement(By.xpath("(//a[.='Droppable'])[2]")).click();
	Thread.sleep(3000);
	WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	WebElement Target = driver.findElement(By.xpath("//p[.='Drop here']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.dragAndDrop(src,Target).perform();
}
}
