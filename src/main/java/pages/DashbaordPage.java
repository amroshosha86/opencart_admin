package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashbaordPage extends PageBase{

	public DashbaordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (linkText = "Catalog")
	WebElement Cataloglink;
	
	@FindBy (linkText = "Products")
	WebElement Productslink;
	
	@FindBy (css = "input[placeholder='Search']")
	WebElement searchinput;
	
	@FindBy (css = "#user-selection")
	WebElement userselction;

	
	public void OpenCatalogPage()
	{
		Cataloglink.click();
	}
	public void OpenproductPage()
	{
		Productslink.click();
	}
	
	public void searching(String searchdata)
	{
		settext(searchinput, searchdata);
		userselction.click();
		
	}
	
	
	
	

}
