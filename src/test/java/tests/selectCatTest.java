package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.DashbaordPage;

public class selectCatTest extends TestBase{
	DashbaordPage DashbaordPageobj;
	CategoryPage CategoryPageobj;
	String catname="Electronics >> Camera & photo";
	String productname="Nikon";
	
  @Test
  public void USerCanSelectCat() throws InterruptedException 
  {
	  DashbaordPageobj =new  DashbaordPage(driver);
	  DashbaordPageobj.OpenCatalogPage();
	  DashbaordPageobj.OpenproductPage();
	  CategoryPageobj=new CategoryPage(driver);
	  Thread.sleep(3000);
	  CategoryPageobj.filterbycategorylist(catname);
	  Assert.assertTrue(CategoryPageobj.productname.getText().contains(productname));
	  System.out.println(CategoryPageobj.productname.getText());
	  //0
  }
}
