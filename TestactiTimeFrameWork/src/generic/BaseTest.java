package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import graphql.schema.diff.reporting.CapturingReporter;

public class BaseTest implements IAutoConstant{

	protected static WebDriver driver;
      @BeforeMethod
	public void setUp() throws IOException
	{
		flib flib = new flib();
		String browserValue=flib.readPropertyFile(PROP_PATH,"browser");
		String url=flib.readPropertyFile(PROP_PATH,"url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
		  Reporter.log("enter valid input",true);
		}
	}
      
      public static void failed(String MethodName)
      {
    	  try {
    		  TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH+MethodName+".png");	
			Files.copy(src, dest);
			
		} catch (Exception e) {
		}
      }
      
      @AfterMethod
      public void tearDown()
      {
    	  driver.close();
      }
}
