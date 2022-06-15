package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowsersAtOneTime {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chhrome.river","./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    Thread.sleep(15000);
    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
     driver=new FirefoxDriver();
    
   }
}
