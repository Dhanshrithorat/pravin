package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteUtilityProperties 
{
	public static void capturescreenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\ScreenShot\\myscreenshot"+TCID+".png");
		FileHandler.copy(src, desti);
	}
	public static String getDatafrompropertiesfile(String key) throws IOException
	{
		Properties prop=new Properties();//create object of new property file
	    FileInputStream myfile=new FileInputStream("C:\\Users\\Sandip01\\eclipse-workspace\\26thMarch\\myproperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
	}

}
