package verification_using_HardAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aseert_equaluse_notEquals {
  @Test
  public void Mymethod() 
  {
	  String a="pravin";
	  String b="pravin1";
	  
	  
	 // Assert.assertEquals(a, b,"a and b not matching tc is fail");
	 // Reporter.log("a and b value are mathing tc is pass ",true);
	  
	  Assert.assertNotEquals(a, b,"a and b matching tc is fail");
	  Reporter.log(" a and b are not matching tc is pass", true);
  }
}


//in hard assert verification is fail hard assert fail the Tc and stop the next execution 