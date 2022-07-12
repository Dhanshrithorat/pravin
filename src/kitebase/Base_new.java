package kitebase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtility.KiteUtilityProperties;

public class Base_new 
{	
protected WebDriver driver;
	public void openbrowser() throws IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(KiteUtilityProperties.getDatafrompropertiesfile("URL"));
		Reporter.log("browesr is launch");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	}
	public  void capturescreenshot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\ScreenShot\\myscreenshot"+TCID+".png");
		FileHandler.copy(src, desti);
	}
}

