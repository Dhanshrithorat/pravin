package verification_using_HardAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_null_Notnull_value {
  @Test
  public void mymethod()
  {
	  String a=null;
	  String b="abc";
	  
	  Assert.assertNull(b, "value is not null tc is fail");
	  Reporter.log("value is null tc is pass",true);
	  
	 // Assert.assertNotNull(b, "value is null tc is fail");
	 // Reporter.log("value is not null tc is pass",true);
  }
}
