package robotClassKeyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	driver.get("https://www.selenium.dev");
	
	Thread.sleep(5000);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_WINDOWS);
	robot.keyPress(KeyEvent.VK_PRINTSCREEN);
	
}
}
