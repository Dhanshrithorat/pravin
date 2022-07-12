package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_use {
  @Test(priority=2)
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
