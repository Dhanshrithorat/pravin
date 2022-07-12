package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sid_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		
		//String text = driver.findElement(By.xpath("//p[@class='desc']")).getText();
	//	System.out.println(text);
	//	Thread.sleep(1000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame("frame");
		WebElement box = driver.findElement(By.xpath("//input[@id='datepicker']"));
		box.click();
		Thread.sleep(1000);
		
	}

}
