package kiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	//data member
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ActualUserNmae;
	@FindBy(xpath="//a[@target='_self']")private  WebElement clickonlogout;
	
	//constructor
	public  Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//methods
	public void actualusrid()
	{
		String ActualUID = ActualUserNmae.getText();
		String expectedUseName = "ELR321";
		
		if(expectedUseName.equals(ActualUID))
		{
			System.out.println("expectedusername and actual user name match TC is pass");
		}
		else
		{
			System.out.println("expectedusername and actual user name not  match TC is fail");
		}
		
	}
	public void logout() throws InterruptedException
	{
		ActualUserNmae.click();
		Thread.sleep(1000);
		clickonlogout.click();
	}

}
