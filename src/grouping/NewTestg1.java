package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestg1 {
	 @Test
	  public void a()
	  {
		
		  Reporter.log("i am running  a",true);
	  }
	  @Test(groups = "sanity")
	  public void b()
	  {
		  
		  Reporter.log("i am running sanity b",true);
	  }
	  @Test(groups = "Regression")
	  public void c()
	  {
		  
		  Reporter.log("i am running Regression c",true);
	  }
	  @Test(groups = "sanity")
	  public void d()
	  {
		  Reporter.log("i am running  sanity d",true);
	  }
  
}
