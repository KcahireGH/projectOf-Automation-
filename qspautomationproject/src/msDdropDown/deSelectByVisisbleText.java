package msDdropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectByVisisbleText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Karan/Desktop/Automation/MSDdropdown.html");
	WebElement dropdownElement = driver.findElement(By.id("MENU"));
    Select sel = new Select(dropdownElement);
	sel.selectByVisibleText("paratha");
	Thread.sleep(5000);
	sel.deselectByVisibleText("paratha");
}
}
