package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_selecttable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:demoqa.com/select-menu");
		
		
		Thread.sleep(1000);
		WebElement multiselect = driver.findElement(By.name("cars"));
		Select s1 = new Select(multiselect);
		System.out.println("multiselect element is "+s1.isMultiple());
		s1.selectByVisibleText("Volvo");
		Thread.sleep(100);
		s1.selectByValue("saab");
		Thread.sleep(100);
		s1.selectByIndex(3);
	   // Thread.sleep(100);
	    //s1.selectByIndex(2);
	    
	   // s1.deselectAll();	
	   //s1.deselectByIndex(2);
	    //s1.deselectByIndex(3);
	    //s1.deselectByValue("saab");
	    //s1.deselectByVisibleText("Volvo");
	    
	   System.out.println( s1.getFirstSelectedOption().getTagName());
	    
	    
		s1.getAllSelectedOptions();
		
		

	}

}
