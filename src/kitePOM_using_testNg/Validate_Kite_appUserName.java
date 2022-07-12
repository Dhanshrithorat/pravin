package kitePOM_using_testNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validate_Kite_appUserName {
	WebDriver driver;
	Sheet mysheet;
	Kite_Login_Page login;
	Pin_Page pin;
	Home_Page home;
	
	
	@BeforeClass
	public void logintobrowser() throws EncryptedDocumentException, IOException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		//opt.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("browesr is launch");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		 
		 login= new Kite_Login_Page(driver);
		 pin=new Pin_Page(driver);
		 home=new Home_Page(driver);
		}
	
	@BeforeMethod
	public void loginktokiteapp()
	{
		 String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
			String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
			String PIN = mysheet.getRow(1).getCell(2).getStringCellValue();
			
			login.sendUsername(UN);
			Reporter.log("sending user name",true);
            login.sendpassword(PWD);
			Reporter.log("sending user password",true);
			login.clickonloginbuttom();
			Reporter.log("clickonloginbuttom ",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

			

			
			pin.sendPin(PIN);
			Reporter.log("sending pin ",true);
            pin.continiue();
			Reporter.log("click on continiue button ",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}
  @Test
  public void validateusername()
  {
		 String expectedusername = mysheet.getRow(1).getCell(0).getStringCellValue();
		String actualusername = home.getActualUID();
		Reporter.log("validating user name  ",true);

		Assert.assertEquals(actualusername, expectedusername,"actualusername not matching to exepected tc is fail");
Reporter.log("actualusername and expected are matching tc is pass",true);
  }
  @AfterMethod 
  public void logouttokiteapp() throws InterruptedException
  {
	  
	  home.logout();
		Reporter.log("login out.. ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

  }
  @AfterClass
  public void closebrower() throws InterruptedException 
  {
	 	  driver.close();
	 	 Thread.sleep(2000);

	 Reporter.log("close browser ",true);

  }
}
