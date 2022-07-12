package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		
		Select s = new Select(listbox);
		
		//3.By using one of the select class methods we can select values form list box like
		
		s.selectByVisibleText("Option3");
		
		Thread.sleep(1000);
		s.selectByValue("option1");
		
		Thread.sleep(1000);
		s.selectByIndex(2);
				

	}

}
