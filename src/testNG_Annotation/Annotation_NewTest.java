package testNG_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_NewTest {
  @Test
  public void recharge() 
  {
	  Reporter.log("recharge ",true );
  }
  @BeforeMethod
  public void loginrecharge() 
  {
	  Reporter.log("login recharge module  ",true );

  }

  @AfterMethod
  public void loginbrowesr()
  {
	  Reporter.log("login recharge browser ",true );

  }

  @BeforeClass
  public void logoutrecharge() 
  {
	  Reporter.log(" logout recharge ",true );

  }

  @AfterClass
  public void logoutbrowesr()
  {
	  Reporter.log("logout browser ",true );

  }

}
