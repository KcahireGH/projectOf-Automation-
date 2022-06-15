package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class testActitimeValidLogin{
 static WebDriver	driver;
public static void main(String[] args) throws IOException {
	BaseTest bt = new BaseTest();
	bt.setUp();
	flib flib = new flib();
	
	String validusername = flib.readPropertyFile("./data/cofigu.properties","username");
	String validpassword = flib.readPropertyFile("./data/cofigu.properties","password");
	
	LoginPage lp = new LoginPage(driver);
	
	lp.Actitimevalidlogin(validusername, validpassword); 

    bt.teardown();
}
}
