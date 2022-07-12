package grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	  @Test
	  public void m()
	  {
		  Assert.fail();
		  Reporter.log("i am m",true);
	  }
	  @Test
	  public void b()
	  {
		  
		  Reporter.log("i am b",true);
	  }
	  @Test
	  public void x()
	  {
		  Reporter.log("i am x",true);
	  }
}
