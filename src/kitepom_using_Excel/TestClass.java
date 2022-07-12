package kitepom_using_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		 String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(1).getCell(2).getStringCellValue();

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		Kite_Login_Page login=new Kite_Login_Page (driver);
		login.sendUsername(UN);
		login.sendpassword(PWD);
		login.clickonloginbuttom();
		Thread.sleep(1000);
		
		Pin_Page pinpage=new Pin_Page(driver);
		pinpage.sendPin(PIN);
		pinpage.continiue();
		
		Thread.sleep(1000);
		Home_Page hpage=new Home_Page(driver);
		hpage.actualusrid(UN);

		hpage.logout();
		
		driver.close();
		

	}

}
