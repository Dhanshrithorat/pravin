package listenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerTest.ListenerTest.class)
public class MyTest {
  @Test
  public void mymethod1()
  {
	  Reporter.log("Hi I Am Mymethod1",true);
  }
  @Test
  public void mymethod2()
  {
	  Assert.fail();
	  Reporter.log("Hi I Am Mymethod2",true);
  }
  @Test(dependsOnMethods = {"mymethod2"})
  public void mymethod3()
  {
	  Reporter.log("Hi I Am Mymethod3",true);
  }
}
