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

	@FindBy(linkText = 	"Logout")
	WebElement logoutbtn;
	
	@FindBy(linkText = 	"Login")
	WebElement loginbtn;
	
	
	
	public void openMyAccountLink()
	{
		myaccountlink.click();
	}

	public void openRegistrationPage()
	{
		registerlink.click();
	}

	public void logout()
	{
		myaccountlink.click();
		logoutbtn.click();
	}
	
	public void openloginpage()
	{
		myaccountlink.click();
		loginbtn.click();
	}
	







}





