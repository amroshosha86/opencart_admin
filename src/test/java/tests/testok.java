package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegsiterPage;

public class testok extends TestBase{
	HomePage homeobj;
	RegsiterPage regsiterobj ;
	String FirstName="amro";
	String LastName="amro";
	String email ="amro@msnm.com";
	String phone="010655555";
	String password="12345678";
	
  @Test(priority = 1)
  public void UserCanReg000()
	{
		driver.navigate().to("https://www.py4u.net/discuss/581669");


	}
}
