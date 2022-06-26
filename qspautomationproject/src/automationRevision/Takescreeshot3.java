package automationRevision;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Takescreeshot3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=jdtq7js5ob91");
	
	EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	File src = efw.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/actitimeLogInusingEVENTFIRINGWEBDRIVER.png");
	Files.copy(src, dest);
}
}
