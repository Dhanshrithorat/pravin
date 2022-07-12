package crossbrowesrtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void mymethod() throws InterruptedException
  {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\selenium-java-4.1.4\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);

		driver.close();
  }
}
