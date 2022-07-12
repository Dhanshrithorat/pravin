package inCludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class includeNewTest {
	  @Test
	  public void P()
	  {
		  Reporter.log("i am p",true);
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
