package crossbrowesrtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting02 {
	@Parameters("browserName")
  @Test
  public void mymethod(String name) throws InterruptedException 
  {
		WebDriver driver=null;
		if(name.equals("firfox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\selenium-java-4.1.4\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
		
		}
		else if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
	  
  }
}
