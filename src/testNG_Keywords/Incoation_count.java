package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Incoation_count {
  @Test(invocationCount = 2)
  public void fmytest1()
  {
	  Reporter.log("hi",true);
  }
  @AfterMethod
  public void test()
  {
	  Reporter.log("Hello",true);
  }
  
}
