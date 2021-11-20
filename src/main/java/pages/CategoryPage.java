package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage extends PageBase {

	public CategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#SearchCategoryId")
	WebElement categoryddl;
	
	@FindBy(xpath = "//button[@id='search-products']")
	WebElement searchbtn;
	
	@FindBy(xpath = "//td[contains(text(),'Nikon D5500 DSLR')]")
	public WebElement productname;
	
	

	public void filterbycategorylist(String catname)
	{
		select=new Select(categoryddl);
		select.selectByVisibleText(catname);
		searchbtn.click();

	}

}
