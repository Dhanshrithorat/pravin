package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Broweser_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String mainpageID = driver.getWindowHandle();
		System.out.println(mainpageID);
		
		System.out.println("=========");
		//to open child window
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(1000);
		//to handle multiple windows/ to get multiple ids
		
		Set<String> allpageids = driver.getWindowHandles();
		 Iterator<String> it = allpageids.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		

	}

}
