package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_display {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		//WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.name("show-hide"));

       if(textbox.isDisplayed())
       {
    	   System.out.println("thank you text box is display");
       }
       else
       {
       System.out.println("can't open text");
       }
       hide.click();
       if(textbox.isDisplayed())
       {
    	   System.out.println("thank you text box is display");
       }
       else
       {
    	   System.out.println("can't display text box");
       }
	}

	

}
