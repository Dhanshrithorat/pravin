package exelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     System.out.println(name);
     
      double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
     System.out.println(number);
     
      String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
       System.out.println(mychar);
       
      boolean myvalue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
       System.out.println(myvalue);
	}

}
