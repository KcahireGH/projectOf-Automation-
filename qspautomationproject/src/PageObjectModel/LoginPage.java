package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInLabel") private WebElement keepmelogincheckbox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink")private WebElement licensceLink;
	
	
	//initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


		//utilization
	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getKeepmelogincheckbox() {
		return keepmelogincheckbox;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getLicensceLink() {
		return licensceLink;
	}
	
   //generic reusable method
	
	public void Actitimevalidlogin(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginbtn.click();
	}
	
	public void Actitimeinvalidlogin(String invalidUsername, String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginbtn.click();
	}
	
}
