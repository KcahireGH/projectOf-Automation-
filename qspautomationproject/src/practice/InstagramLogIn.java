package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogIn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karanAhire@123");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
