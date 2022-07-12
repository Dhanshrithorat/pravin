package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_eg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//fullpage screenshot
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\ScreenShot\\ScreenShot.png");
		
		FileHandler.copy(src, destination);
		//Thread.sleep(1000);
		driver.manage().window().minimize();
		
	}

}

