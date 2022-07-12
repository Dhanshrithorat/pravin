package testNG_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaion_Stuady {
  @Test
  public void validateuserid()
  {
	  Reporter.log("user id validated",true);
  }
  @Test
  public void validatedashboard()
  {
	  Reporter.log("dash board validated ",true);
  }

@BeforeMethod
public void loginTokiteApp() 
{
	  Reporter.log(" login sucess",true);
}

@BeforeClass 
public void LunchBrowser()
{
	  Reporter.log(" browser lunched",true);
}
@AfterMethod
public void logoutkiteApp()
{
	Reporter.log(" logout sucess",true);
}
@AfterClass
public void closebrowser()
{
	Reporter.log("  browser closed ",true);
}
}