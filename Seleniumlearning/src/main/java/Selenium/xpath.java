package Selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String iepath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", iepath);
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.demoaut.com/");
		
	    driver.findElement(By.xpath("//td[2]/input")).sendKeys(("mercury"));
	   driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys(("mercury"));
	   driver.findElement((By.xpath("//div/input"))).click();
	   
	   
		

	}

}
