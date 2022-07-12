package popups;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String mid = driver.getWindowHandle();
		System.out.println(mid);
		
		System.out.println("=======");
		
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid);
		
		System.out.println("==============");
		Set<String> allpageids = driver.getWindowHandles();
		 Iterator<String> it = allpageids.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		
		
				
				
				
		
		
	}

}
