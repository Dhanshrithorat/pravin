package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
	@Test(timeOut=200)
	  public void P() throws InterruptedException
	  {
		  Reporter.log("i am p",true);
		  Thread.sleep(2000);
	  }
	  @Test
	  public void A()
	  {
		  Reporter.log("i am a",true);
	  }
	  @Test
	  public void Z()
	  {
		  Reporter.log("i am z",true);
	  }
}
