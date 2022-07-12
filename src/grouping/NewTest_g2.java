package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest_g2 {
	 @Test
	  public void p()
	  {
		  Reporter.log("i am running  p",true);
	  }
	  @Test(groups = "Regression")
	  public void q()
	  {
		  Reporter.log("i am running Regression q",true);
	  }
	  @Test(groups = "sanity")
	  public void r()
	  {
		  Reporter.log("i am running sanity r",true);
	  }
	  @Test(groups = "Regression")
	  public void s()
	  {
		  Reporter.log("i am running Regression s",true);
	  }
}
