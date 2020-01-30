package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String iepath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", iepath);
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.demoaut.com/");
		
		driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("mercury");
		
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("mercury");
		
		driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
		
		driver.findElement(By.cssSelector("a[ref='mercurywelcome.php']")).click();
		

	}

}
