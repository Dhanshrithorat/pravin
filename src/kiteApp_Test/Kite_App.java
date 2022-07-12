package kiteApp_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_App {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		  driver.findElement(By.id("userid")).sendKeys("ELR321");
		  driver.findElement(By.id("password")).sendKeys("Dhana1111");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("pin")).sendKeys("982278");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(1000);
		 WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String ActualUserId = UserName.getText();
		String expectedUserID="ELR321";
if(ActualUserId.equals(expectedUserID))
{
	System.out.println("user id is matching TC is pass ");
	
}
else
{
	System.out.println(" user id not matching TC is fail");
}
UserName.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@target='_self']")).click();
Thread.sleep(1000);
driver.close();
	}

}
