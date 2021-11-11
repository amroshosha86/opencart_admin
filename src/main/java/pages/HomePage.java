package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css = "a[title='My Account']")
	WebElement myaccountlink;
	
	@FindBy(linkText = "Register")
	WebElement registerlink;
	
	
	public void openMyAccountLink()
	{
		myaccountlink.click();
	}
	
	public void openRegistrationPage()
	{
		registerlink.click();
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		

	}
	
	


