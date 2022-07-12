package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10);
		
	System.out.println(driver.manage().window().getPosition());
	
	// to set position we need to create object of Point Class and pass X and Y coordinate
     
	Point p = new Point(500,400);
	driver.manage().window().setPosition(p);
	}

}
