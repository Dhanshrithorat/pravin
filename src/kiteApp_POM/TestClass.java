package kiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		Kite_Login_Page login=new Kite_Login_Page (driver);
		login.sendUsername(null);
	    login.sendpassword(null);
		login.clickonloginbuttom();
		Thread.sleep(1000);
		
		Pin_Page pinpage=new Pin_Page(driver);
		pinpage.sendPin();
		pinpage.continiue();
		
		Thread.sleep(1000);
		Home_Page hpage=new Home_Page(driver);
		hpage.actualusrid();
		hpage.logout();
		
		driver.close();
		

	}

}
