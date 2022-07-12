package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facbook_implict_wt {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		
		driver.findElement(By.id("email")).sendKeys("pravinmorea10@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8329104609");
		

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		driver.close();
	}
	
	
	
	
	
	

}
