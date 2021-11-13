package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="(//button[@type='button'])[9]")
	WebElement addtocart;
	
	public void addtocart() throws InterruptedException
	{
		
		addtocart.click();
		
		
	}
	
	
	

}
