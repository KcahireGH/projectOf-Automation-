package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCartButton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    driver.findElement(By.xpath("//span[.='Cart']")).click();
    //Thread.sleep(3000); without using thread we cant do the execution of the programme 
    driver.findElement(By.xpath("//span[.='Login']")).click();
}
}
