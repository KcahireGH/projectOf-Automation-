package methodsofWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethodForEach {//by using for each (advance loop) loop only
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.google.com");
    driver.switchTo().activeElement().sendKeys("realme");
    Thread.sleep(3000);
    List<WebElement> searchText = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
  
	for(WebElement sugg:searchText)
    {
    	String textOfWebElement=sugg.getText();
    	System.out.println(textOfWebElement);
    }
      
}
}
