package kitePOM_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page 
{
	//data member
	
	@FindBy(id="userid") private WebElement Username;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	//constructor
	
	public Kite_Login_Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//methods
	public void sendUsername(String username)
	{
		Username.sendKeys(username);
	}
	public void sendpassword(String PassWord)
	{
		password.sendKeys(PassWord);
	}
	public void clickonloginbuttom()
	{
		loginButton.click();
	}


}
