package excel_Demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class read_Excel {

	public static void main(String[] args) throws IOException
	{
			File src = new File("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");//file path which we created in xml sheet
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
			
			// TODO Auto-generated method stub
			String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			WebDriver driver= new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			
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
				
			
				driver.findElement(By.linkText("Home")).click();
				
				String expectedTitle = "Welcome: Mercury Tours123";
				String actualTitle = driver.getTitle();
				
				if(expectedTitle.equals(actualTitle))
				{
					System.out.println("same");
					sheet1.getRow(0).createCell(3).setCellValue("Results");
					sheet1.getRow(i).createCell(3).setCellValue("Pass: Home page");
				}
				
				else
				{
					System.out.println("not in home");
					sheet1.getRow(0).createCell(3).setCellValue("Fail: not in home page");
				}
				FileOutputStream fout = new FileOutputStream("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");
			}
			wb.close();
			driver.close();
			
		}
	

	}

	


