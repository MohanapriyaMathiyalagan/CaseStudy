package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getDriverStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demoaut.com/");
		
        driver.findElement(By.linkText("REGISTER")).click();
		 driver.findElement(By.name("firstName")).sendKeys("Priya");
		 driver.findElement(By.name("lastName")).sendKeys("Miya");
		 driver.findElement(By.name("phone")).sendKeys("4747283");
		 
		 
		 driver.findElement(By.name("userName")).sendKeys("miya@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("xyz,hdb ");
		 driver.findElement(By.name("city")).sendKeys("Namakkal");
		 driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		 driver.findElement(By.name("postalCode")).sendKeys("637408");
		 
		 Select select= new Select(driver.findElement(By.name("country")));
		 select.selectByVisibleText("INDIA");
		 
		 
		 driver.findElement(By.id("email")).sendKeys("hjdbj@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("miya29");
		 driver.findElement(By.name("confirmPassword")).sendKeys("miya29");
		 driver.findElement(By.name("register")).click();
	}

}
