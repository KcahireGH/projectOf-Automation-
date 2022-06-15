package takeScreenShotMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class takeScreenShotWay3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.instagram.com");
	
	
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/instagramloginpage.png");
    Files.copy(src, dest);
}
}
