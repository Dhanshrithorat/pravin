package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Iframe_eg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		String text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text1);
		
		driver.switchTo().frame("frame1");
		String text2 = driver.findElement(By.xpath("//b[@id='topic']")).getText();
		System.out.println(text2);
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("pravin");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
		driver.findElement(By.className("col-lg-3"));
		
		
		
	
		

	}

}
