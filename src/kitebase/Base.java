package kitebase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("browesr is launch");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	}

}
