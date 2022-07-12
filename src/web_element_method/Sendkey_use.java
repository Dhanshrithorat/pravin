package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("pravin");
		
		Thread.sleep(1100);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		

	}

}
