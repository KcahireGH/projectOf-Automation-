package PageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyDriverFrameWork.Flib;

public class BaseTest
{
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readPropertyFile("./data/configu.properties","browser");
		String Url = flib.readPropertyFile("./data/configu.properties","url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(Url);
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(Url);
		}
		else
		{
		System.out.println("Enter the correct choice");	
		}
	}
		
		public void teardown()

	    {
	       driver.quit();		
	    }

}
