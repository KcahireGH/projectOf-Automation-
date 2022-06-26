package automationRevision;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshot4 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=jdtq7js5ob91");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	WebElement target = driver.findElement(By.xpath("//a[.='Create new tasks']"));
	File src = target.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/actitimeLogInusingWEBELEMENT.png");
	Files.copy(src, dest);
	
}
}
