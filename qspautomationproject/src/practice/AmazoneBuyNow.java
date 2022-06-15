package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneBuyNow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus 8t 5G",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='(Renewed) OnePlus 8T 5G (Aquamarine Green, 8GB RAM, 128GB Storage)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='submit.buy-now']")).click();
	
	}

}
