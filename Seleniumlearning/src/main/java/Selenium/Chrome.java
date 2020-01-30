package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.co.in");
	}

}
