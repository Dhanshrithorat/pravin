package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_eg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		Select s1= new Select(dropdown);
		
		s1.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.findElement(By.name("enter-name")).sendKeys("123");
		
		driver.findElement(By.id("hide-textbox"));
		
				
		
		

	}

}
