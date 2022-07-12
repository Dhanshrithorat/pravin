package kitebase;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

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
	

}
