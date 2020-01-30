package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Se_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String iepath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", iepath);
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demoaut.com/");
	}

}

