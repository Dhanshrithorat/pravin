package kiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_Page {
	
	// data member
	@FindBy(id="pin")private  WebElement Pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement clickonContinue;
	
	
	
	//Constructor
	
	public  Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//method
	
	public void sendPin()
	{
		Pin.sendKeys("982278");
	}
	public void continiue()
	{
		clickonContinue.click();
	}

}
