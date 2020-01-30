package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equals("ie"))
		{
			String iepath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iepath);
			return new InternetExplorerDriver();
		}
		
		else if(browserName.contentEquals("Chrome"))
		{
			String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			return new ChromeDriver();
		}
		
		else
		{
			return null;
		}
				
			
	}

	public static Object findElement(Object xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
