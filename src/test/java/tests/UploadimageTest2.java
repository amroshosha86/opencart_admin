package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.productdetailsPage;

public class UploadimageTest2 extends TestBase {
	productdetailsPage productdetailsPageobj;

	@Test
	public void f() throws InterruptedException, AWTException 
	{
		driver.get("https://admin-demo.nopcommerce.com/Admin/Product/Edit/1");
		productdetailsPageobj = new productdetailsPage(driver);
		productdetailsPageobj.scrooldown();
		productdetailsPageobj.openimagediv();
		

		String imageName = "avatar-blank.jpg";
		String imagePath = System.getProperty("user.dir")+"\\Uploads\\"+imageName;
		System.out.println(System.getProperty("user.dir"));


		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".upload-button-container")).click();
	
		Robot robot = new Robot();
		// CTRL + C copy image path
		StringSelection selection = new StringSelection(imagePath);
		System.out.println(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		// Click on CTRL + V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		productdetailsPageobj.scrooldownagain();

		WebElement savebtn = driver.findElement(By.name("save")); 
		savebtn.click();

		
	}

}
