package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    driver.findElement(By.className("_3704LK")).sendKeys("laptop");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[.='Core i5']/descendant::div[@class='_1Y4Vhm _4FO7b6']")).click();
    driver.findElement(By.xpath("//div[.='HP']/ancestor::div[@class='_3FPh42']")).click();	
}
}
