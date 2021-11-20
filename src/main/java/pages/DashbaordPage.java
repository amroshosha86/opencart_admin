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
	
	 
	
	
	public void OpenCatalogPage()
	{
		Cataloglink.click();
	}
	public void OpenproductPage()
	{
		Productslink.click();
	}
	
	
	

}
