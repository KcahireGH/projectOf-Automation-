package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//declaration
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement Logout;
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createnewtask;
	@FindBy(linkText="Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveleavebtn;
	
	
	//initialization
	

	public Homepage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
   


	//utilization
	

	public WebElement getLogout() {
		return Logout;
	}


	public WebElement getCreatenewtask() {
		return createnewtask;
	}


	public WebElement getSettings() {
		return settings;
	}


	public WebElement getSaveleavebtn() {
		return saveleavebtn;
	}
	
	//operational
	public void clicklogout()
	{
		Logout.click();
	}
	
	public void clicksaveleavebtn()
	{
		saveleavebtn.click();
	}
	
}
