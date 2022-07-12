package verification_using_HardAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true_false_use {
  @Test
  public void  Mymethod()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(a, "a is false tc is fail");
	 Reporter.log("a is true tc is pass",true);
	  
	 // Assert.assertFalse(b, "b is true tc is fail");
	 // Reporter.log("b is  false tc is pass",true);
	  
  }
}
