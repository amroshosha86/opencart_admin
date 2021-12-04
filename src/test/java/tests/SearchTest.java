package tests;

import org.testng.annotations.Test;

import pages.DashbaordPage;

public class SearchTest extends TestBase {
	
	DashbaordPage DashbaordPageobj;
	String searchdata="Affiliates";
	
  @Test
  public void UserCanSearch() {
	  DashbaordPageobj=new DashbaordPage(driver);
	  DashbaordPageobj.searching(searchdata);
  }
}
