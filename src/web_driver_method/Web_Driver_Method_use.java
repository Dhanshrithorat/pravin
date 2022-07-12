package web_driver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Method_use {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Webdriver methods :It is an interface use to perform action of browser
		
		//1. get- to enter url in browser or to open an application.

		driver.get("https://vctcpune.com/");
		//driver.get("https://www.facebook.com/");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		
		//3. quit: to close the all the tabs present in browser opened by Selenium tool.
		driver.quit();
		
		//4. maximize/ minimize() - used to maximize/ minimize the browse * note: can't minimize the browser(we can change size & position of the browser).

		driver.manage().window().maximize();
		//driver.manage().window().minimize();0
		
		//5. navigate: this method is use to open an application, move forward, backward & refresh the webpage.
		
		//driver.get("https://vctcpune.com/");
	    Thread.sleep(1000);
		//driver.navigate().refresh();
		//driver.navigate().back();
		driver.navigate().forward();

	}

}
