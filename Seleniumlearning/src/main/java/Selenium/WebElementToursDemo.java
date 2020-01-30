package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementToursDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iepath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", iepath);
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.demoaut.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement Uname=driver.findElement(By.name("userName"));
		Uname.sendKeys("mercury");
		Uname.clear();
		
		WebElement Pwd=driver.findElement(By.name("password"));
		Pwd.sendKeys("mercury");
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement signIn = null;
		signIn.click();
		
		WebElement home1= driver.findElement(By.linkText("Home"));

	}

}
