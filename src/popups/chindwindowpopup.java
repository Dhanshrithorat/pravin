package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chindwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 
		String mainpid = driver.getWindowHandle();
		System.out.println(mainpid);
		
		WebElement ntab = driver.findElement(By.name("NewWindow"));
		ntab.click();
		System.out.println("+++++=++++++");
		
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		driver.quit();

	}

}
