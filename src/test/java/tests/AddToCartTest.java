package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCartTest extends TestBase {
	HomePage HomePageobj;
	ProductDetailsPage ProductDetailsPageobj;
	
  @Test(priority = 1)
  public void UserCanAddToCart() throws InterruptedException {
	  HomePageobj=new HomePage(driver);
	  HomePageobj.openmacpage();
	  ProductDetailsPageobj=new ProductDetailsPage(driver);
	  ProductDetailsPageobj.addtocart();
  }
}
