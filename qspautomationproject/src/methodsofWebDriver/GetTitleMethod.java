package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 String titleOfLoginPage = driver.getTitle();
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		 driver.manage().window().minimize();
		 System.out.println(titleOfLoginPage);

	}

}
