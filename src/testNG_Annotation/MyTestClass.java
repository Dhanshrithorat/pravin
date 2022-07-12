package testNG_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void fMymethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		System.out.println(" hi method is runnig this is printing statment");
		Reporter.log("hi method is running is reporter method");
		Reporter.log("hi method is running is reporter method 1", true);
		Thread.sleep(2000);
  }
  
  @Test
  public void Mymethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
  
}
}
