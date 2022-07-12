package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_OnPracticePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("arguments[0].scrollIntoView(true)",radio);
		radio.click();
		
		WebElement sugession = driver.findElement(By.id("autocomplete"));
		jc.executeScript("arguments[0].scrollIntoView(true)",sugession);
		sugession.sendKeys("pravin");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();

	}

}
