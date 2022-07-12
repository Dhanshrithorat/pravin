package exelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exell_Sheet_Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("C:\\selenium\\selenium exel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		int TotalNoofRow = mysheet.getLastRowNum();
		int rowcount = TotalNoofRow;
		System.out.println("Total no of rows are "+ rowcount);
		
		short totalnoofcell = mysheet.getRow(TotalNoofRow).getLastCellNum();
		int cellcount = totalnoofcell-1;
		System.out.println("Total no of cell "+ cellcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=cellcount;j++)
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType datatype = cellvalue.getCellType();
				
				if(datatype==CellType.STRING)
				{
					String value = cellvalue.getStringCellValue();
					System.out.print(value+" ");
				}
				else if (datatype==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					 boolean value = cellvalue.getBooleanCellValue();
					 System.out.print(value+ " ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print("");
				}
				
				
			}
			System.out.println("");
		}
	}

}
