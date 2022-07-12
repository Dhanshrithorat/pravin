package listenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kitebase.Base_new;

public class ListenerTest  implements ITestListener 
{
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Screenshot taken ,please check TC",true);
		Reporter.log("Failed tc name is "+result.getName(),true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log(" TC is Skiiped please check dependent method",true);
		Reporter.log("Skiiped tc name is "+result.getName(),true);

	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log(" TC is pass",true);
		Reporter.log("Seucess tc name is "+result.getName(),true);

		}
	

}
