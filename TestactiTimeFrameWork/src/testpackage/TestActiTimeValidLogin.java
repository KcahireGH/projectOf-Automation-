package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest{
	
	@Test
	public void actiTimeValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		flib flib = new flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		lp.actiTimevalidLogin(validUsername, validPassword);
		
	}

}