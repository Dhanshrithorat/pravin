package setSizeAndPosition;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10);
		
		System.out.println(driver.manage().window().getSize());
		
		////to set size, need to create object of Dimension class and pass Width and Height
       
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(20,1000);
		
		// using setSize method we can set size
		
		driver.manage().window().setSize(d);
		 
		//driver.quit();
	}

}
