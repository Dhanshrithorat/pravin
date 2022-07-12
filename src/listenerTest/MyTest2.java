package listenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenerTest.ListenerTest.class)
public class MyTest2 {
  @Test
  public void mymethod4()
  {
	  Reporter.log("Hi I Am Mymethod4",true);
  }
  @Test
  public void mymethod5()
  {
	  Assert.fail();
	  Reporter.log("Hi I Am Mymethod5",true);
  }
  @Test(dependsOnMethods = {"mymethod5"})
  public void mymethod6()
  {
	  Reporter.log("Hi I Am Mymethod6",true);
  }
}
