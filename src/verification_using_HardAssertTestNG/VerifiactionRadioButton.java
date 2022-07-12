package verification_using_HardAssertTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifiactionRadioButton {
  @Test
  public void mymethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		
		if(Radio1.isSelected())
		{
			Reporter.log("tc pass radio button is  selected",true);
		}
		else {
			Reporter.log("Tc fail Radio button is not slected",true);
		}
		
	//	Assert.assertTrue(Radio1.isSelected(), "Radio buttun is not selected tc is fail");
		
  }
}
