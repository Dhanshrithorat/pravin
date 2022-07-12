package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_eg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuuCyy8UV3jX4aDDF7TAtjAiwUg_EwIVzQwJlRJDkn2ozF4pYHfj3MkaAgnVEALw_wcB");
		Thread.sleep(1000);
	  
	
		WebElement daytbox = driver.findElement(By.name("birthday_day"));
		Select s = new Select(daytbox);
		s.selectByVisibleText("10");
		Thread.sleep(100);
		
		WebElement monthbox = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(monthbox);
		s1.selectByVisibleText("Nov");
		Thread.sleep(100);
		
		WebElement yearbox = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(yearbox);
		s2.selectByVisibleText("1993");
		
		
		
		
		
		

	}

}
