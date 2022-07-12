package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteApp_POM.Kite_Login_Page;
import kitePOM_using_testNg.Home_Page;
import kitePOM_using_testNg.Pin_Page;
import kitebase.Base;
import kitebase.KiteUtility;

public class validatekiteuserID extends Base {
	Home_Page home;
	Kite_Login_Page login;
	Pin_Page pin;
	String TCID="1234";
	@BeforeClass
	public void launchbrowser()
	{
		openbrowser();
		login=new Kite_Login_Page(driver);
		pin=new Pin_Page(driver);
		home=new Home_Page(driver);
	}
	@BeforeMethod
	public void loginkiteapp() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(KiteUtility.readDataFromExel(1, 0));
		login.sendpassword(KiteUtility.readDataFromExel(1, 1));
		login.clickonloginbuttom();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(KiteUtility.readDataFromExel(1, 2));
		pin.continiue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
  @Test
  public void validateuserid() throws EncryptedDocumentException, IOException
  
  {
	
	  Assert.assertEquals(home.getActualUID(), KiteUtility.readDataFromExel(1, 0),"actual and expected username not match tc failed"); 
  KiteUtility.capturescreenshot(driver, TCID);
  }
  @AfterMethod
  public void logoutfromkite() throws InterruptedException
  {
	  home.logout();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
