package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//WebElement seleniumbutton = driver.findElement(By.linkText("Selenium"));
		// seleniumButton.click();--> using WebElement method
		
		// How to click using Actions class
		// Create object of Actions class and pass driver object
		
		Actions act=new Actions(driver);
		//using one the required actions complete the process

		/*act.moveToElement(seleniumbutton).perform();
		act.click().perform();
		
		act.moveToElement(seleniumbutton).click().build().perform();
		act.click().perform();*/
		
		// How to right click(contextClick)using actions class
	//	WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(rightclickbutton).contextClick().build().perform();
	//	act.contextClick().perform();
		
		WebElement Doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Doubleclickbutton).perform();
		
	}

}
