package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderLIst {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
         List<WebElement> searchresult = driver.findElements(By.xpath("//ul[@class='erkvQe'][1]//li"));
      System.out.println(searchresult.size());
      
      for(WebElement p:searchresult)
      {
    	  System.out.println(p.getText());
      }
      
	}

}
