package automationRevision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCodeMethod {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=jdtq7js5ob91");
	String PageSourceCode=driver.getPageSource();
	System.out.println(PageSourceCode);
}
}
