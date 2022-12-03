package NMMS2022_23_LibraryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String getschooldetails(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\NMMS2022-23\\Propertyfile\\schoollogindetails.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		String values = pr.getProperty(key);
		return values;
	}
	public static String getexceldata(int row , int col) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\NMMS2022-23\\TestData\\SchoolData.xlsx");
		
		Sheet school1 = WorkbookFactory.create(file).getSheet("school1");
		String values = school1.getRow(row).getCell(col).getStringCellValue();
		
		return values;
	
	}
}
