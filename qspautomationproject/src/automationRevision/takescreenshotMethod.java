package automationRevision;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshotMethod {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=jdtq7js5ob91");
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File value = new File("./screenshot/actitimeLogInPage.png");
	Files.copy(src, value);
	
	
}
}
