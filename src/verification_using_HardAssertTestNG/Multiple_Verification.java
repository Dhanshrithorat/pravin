package verification_using_HardAssertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiple_Verification {
  @Test
  public void Mymethod() 
  {
	  String a="pune";
	  String b="pune1";
	  
	  Assert.assertNotEquals(a, b,"a and b equal tc is fail");
	  Assert.assertNotNull(b, "value is not null tc is pass");
	  }
}
