package frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(1000);
		
		String text1 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(text1);
		
		driver.switchTo().frame("Frame1");
		String text2 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text2);
		
		//driver.switchTo().frame("Frame2");
		//String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).click();
		//System.out.println(text3);
		
		//xpath by linked text
		
		driver.switchTo().parentFrame();
		String text4 = driver.findElement(By.linkText("Blogger")).getText();
		System.out.println(text4);
		
		
		driver.manage().window().minimize();
		
		

	}

}
