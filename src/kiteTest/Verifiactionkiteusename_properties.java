package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteApp_POM.Kite_Login_Page;
import kitePOM_using_testNg.Home_Page;
import kitePOM_using_testNg.Pin_Page;
import kiteUtility.KiteUtilityProperties;
import kitebase.Base;
import kitebase.Base_new;
import kitebase.KiteUtility;
@Listeners(kiteUtility.Listener.class)
public class Verifiactionkiteusename_properties extends Base_new {
	Home_Page home;
	Kite_Login_Page login;
	Pin_Page pin;
	String TCID="555";
	//WebDriver driver;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openbrowser(); 

		login=new Kite_Login_Page(driver);
		pin=new Pin_Page(driver);
		home=new Home_Page(driver);
	}
	@BeforeMethod
	public void loginkiteapp  () throws EncryptedDocumentException, IOException
	{
		login.sendUsername(KiteUtilityProperties.getDatafrompropertiesfile("UN"));
	login.sendpassword(KiteUtilityProperties.getDatafrompropertiesfile("PWD"));
	login.clickonloginbuttom();
	
	
	pin.sendPin(KiteUtilityProperties.getDatafrompropertiesfile("PIN"));
	pin.continiue();
	}
	
  @Test
  public void validateuserid() throws EncryptedDocumentException, IOException
  
  {
	
	 Assert.assertEquals(home.getActualUID(), KiteUtilityProperties.getDatafrompropertiesfile("UN"));
  KiteUtilityProperties.capturescreenshot(driver, TCID);
  Assert.fail();
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


