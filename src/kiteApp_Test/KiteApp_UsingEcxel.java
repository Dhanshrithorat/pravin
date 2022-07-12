package kiteApp_Test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp_UsingEcxel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		

		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		 String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(1).getCell(3).getStringCellValue();
		
		Thread.sleep(2000);
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement PassWord = driver.findElement(By.id("password"));
	    WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	    
	   
	    UserId.sendKeys(UN);
	    PassWord.sendKeys(PWD);
	    loginbutton.click();
	    
	    Thread.sleep(1000);
	    WebElement Pin = driver.findElement(By.id("pin"));
		  WebElement Continiuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		  Pin.sendKeys(PIN);
		  Continiuebutton.click();
		  
		  Thread.sleep(1000);
		  
		  WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
			String ActualUserId = UserName.getText();
			String expectedUserID = UN;
			
			if(ActualUserId.equals(expectedUserID))
			{
				System.out.println("user id is matching TC is pass ");
				
			}
			else
			{
				System.out.println(" user id not matching TC is fail");
			}
			UserName.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			Thread.sleep(1000);
			driver.close();
				}

	String expectedUserID="ELR321";
		  
		  
	    
	}


