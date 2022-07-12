package verification_using_softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
  @Test
  public void mymethod()
  {
	  String a="more";
	  String b="more1";
	  
	  //to use soft assert we need to create object of SoftAssert class
	  //if any verification fail in soft assert it goes to next line to execution

	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(a, b,"values are not matching tc is fail");
	  sa.assertNotNull(b, "values are not null tc is pass");
	  sa.assertAll();
  }
  @Test
  public void mymethod1()
  {
	  boolean m=true;
	  boolean p=false;
	 SoftAssert soa = new  SoftAssert();
	 soa.assertTrue(m,"value is not  true tc is fail");
	 soa.assertFalse(p, "value is not false tc is fail");
	 soa.assertAll();
  }
  @Test
  public void mymethod2()
  {
	String n="nilesh";
	String m=null;
	SoftAssert ssa = new SoftAssert();
	ssa.assertNull(m,"vlue is not null tc is fail");
	ssa.assertNotNull(m, "value is null tc is fail");
	ssa.assertAll();
  }
}
