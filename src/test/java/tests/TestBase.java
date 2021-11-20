package tests;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.LoginPage;

public class TestBase {

	public static WebDriver driver;
	Faker fake=new Faker();
	LoginPage LoginPageobj;


	@BeforeSuite
	//StartDriver
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPageobj = new LoginPage(driver);
		LoginPageobj.login();

	}
/*
	@Test(priority = 0)
	public void UserCanLogin()
	{
		LoginPageobj = new LoginPage(driver);
		LoginPageobj.login();

	}
*/
	// close browser
	@AfterSuite
	public void quitBrowser() 
	{
		driver.quit();
	}

}


