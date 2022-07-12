package misc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revie_eg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.boat-lifestyle.com/products/airdopes-141");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		// Alert alt = driver.switchTo().alert();
		//alt.accept();
		
		WebElement review = driver.findElement(By.xpath("(//div[@class='product__info pl-lg-5']//span)[7]"));
		System.out.println(review);
	}

}
