package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_chidBrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String mpid = driver.getWindowHandle();
		System.out.println(mpid);
		
		System.out.println("============");
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> pallid = allid.iterator();
		while(pallid.hasNext())
		{
				System.out.println(pallid.next());
	
	}

}
}
