package takeScreenShotMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenShotWay6 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/downloads");
	
	WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
	
	File src = target.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/seleniumDownload.png");
    Files.copy(src, dest);
}
}
