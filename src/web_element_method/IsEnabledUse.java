package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h6[text()='Sign In']")).click();
		Thread.sleep(1000);
		
		WebElement GETOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(GETOTP.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		Thread.sleep(1000);
		System.out.println(GETOTP.isEnabled());
		GETOTP.click();
		
		
		
		
		
		

	}

	
	
}
