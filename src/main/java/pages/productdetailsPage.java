package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productdetailsPage extends PageBase {

	public productdetailsPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor)driver;
		// TODO Auto-generated constructor stub
	}


	@FindBy(css="#product-pictures")
	WebElement imagediv;

	public void scrooldown()
	{
		scrollToBottom();
	}
	

	public  void openimagediv()

	{
		imagediv.click();
	}

	public  void scrooldownagain()

	{
		js.executeScript("window.scrollTo(0,1.600000381469727)");
		js.executeScript("window.scrollTo(0,10)");

	}


}
