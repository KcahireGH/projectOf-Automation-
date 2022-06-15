package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4xpath {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bekhayali full song");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}
}
