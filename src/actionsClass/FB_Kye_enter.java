package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_Kye_enter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement daybox = driver.findElement(By.id("day"));
		Actions act = new Actions(driver);
		act.click(daybox).perform();
		
		for (int i=1;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
			
		}
		act.sendKeys(Keys.ENTER).perform();
		
	WebElement fname = driver.findElement(By.name("firstname"));
	act.keyDown(fname, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("ravin");
		
	}

}
