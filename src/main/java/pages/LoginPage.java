package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (tagName = "button")
	WebElement loginbtn;
	
	public void login()
	{
		//loginbtn.submit();
		clickbutton(loginbtn);
	}

}
