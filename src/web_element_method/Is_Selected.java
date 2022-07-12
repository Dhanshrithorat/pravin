package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkBoxOption1 = driver.findElement(By.name("checkBoxOption1"));
		
		//checkBoxOption1.click();
		
		if(checkBoxOption1.isSelected()) {
			System.out.println("check box already selected");
		}
		else {
			checkBoxOption1.click();
			System.out.println("check box is now selected");
		}
		
		

	}

}
