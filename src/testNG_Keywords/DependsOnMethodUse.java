package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	 @Test(dependsOnMethods = {"A"},priority = -2)
	  public void P()
	  {
		  Reporter.log("i am p",true);
	  }
	  @Test
	  public void A()
	  {
		  Assert.fail();
		  Reporter.log("i am a",true);
	  }
	  @Test
	  public void Z()
	  {
		  Reporter.log("i am z",true);
	  }
}
