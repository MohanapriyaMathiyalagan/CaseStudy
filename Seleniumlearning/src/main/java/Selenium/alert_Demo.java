package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String path="C:/Users/Training_b6b.01.07/Desktop/Selenium/Seleniumlearning/src/test/java/testNGdemos/popup.html";
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr30127");
		driver.findElement(By.name("password")).sendKeys("EzAtqy");
		driver.findElement(By.name("btnLogin")).submit();
		
		Alert alert=driver.switchTo().alert();
		
		String alterMessage=driver.switchTo().alert().getText();
		
		System.out.println(alterMessage);
		
		alert.accept();

	}

}
