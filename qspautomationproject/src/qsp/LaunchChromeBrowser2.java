package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
    driver.get("https://www.youtube.com/results?search_query=kgf2nd+trailer+hindi+");
    driver.manage().window().minimize();
    driver.close();
	}

}
