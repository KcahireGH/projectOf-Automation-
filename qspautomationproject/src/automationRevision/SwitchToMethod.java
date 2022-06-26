package automationRevision;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=jdtq7js5ob91");
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	
	//--Set the SIZE of Browser---------------------------------------------------------------------------
    Thread.sleep(5000);	
	Dimension Target = new Dimension(450,250);
	driver.manage().window().setSize(Target);
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	Point target = new Point(50,250);
	driver.manage().window().setPosition(target);
	
	
	
	
}
}
