package excel_Demos;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcel_Created {
	
	@Test
	public void readExcelData() throws IOException
	{
		File src = new File("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");//file path which we created in xml sheet
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();
		System.out.println("Total no of rows is :" + rowCount);
		
		for(int i=1;i<=rowCount;i++)
		{
			String firstname = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("First Name is : "+ firstname);
			
			String user = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("User is : "+ user);
			
			String password = sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println("password is : "+ password);
			
			String confirmPassword = sheet1.getRow(i).getCell(3).getStringCellValue();
			System.out.println("confirmPassword is : "+ confirmPassword);
		}
		wb.close();
		
	}

}
