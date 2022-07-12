package kiteUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class KiteUtility
{
	//exelsheet
	//sceenshot
	//closing
	public static String  readDataFromExel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		 Sheet 
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
          String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	     return value;
	}
	
	public static void capturescreenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\ScreenShot\\myscreenshot"+TCID+".png");
		FileHandler.copy(src, desti);
	}
	public void openbrowser() throws IOException
	{
		WebDriver driver;

		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-4.1.4\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(KiteUtilityProperties.getDatafrompropertiesfile("URL"));
			Reporter.log("browesr is launch");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		}
	}

}
