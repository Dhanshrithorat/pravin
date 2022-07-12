package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_LististBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkboxeg = driver.findElement(By.name("checkBoxOption1"));
		checkboxeg.click();

		WebElement checkboxeg1 = driver.findElement(By.name("checkBoxOption2"));
		checkboxeg1.click();
		
		WebElement rediobuttoneg = driver.findElement(By.xpath("//input[@value='Radio3']"));
		rediobuttoneg.click();
	}

}
