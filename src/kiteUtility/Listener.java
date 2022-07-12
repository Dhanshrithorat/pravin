package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kitebase.Base_new;

public class Listener extends Base_new implements ITestListener 
{
	Base_new b=new Base_new();
	WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("congratulation your TC is pass,pass TC name is "+ result.getName(),true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("Sorry your tc is failed fail tc name is "+result.getName(),true);
		String name = result.getName();
		try {
			b.capturescreenshot(name);
			KiteUtilityProperties.capturescreenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
