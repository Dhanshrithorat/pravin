package kitePOM_using_testNg;

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
	
	public void sendPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	public void continiue()
	{
		clickonContinue.click();
	}

}
