package testNGdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttestngfile {

	
	public String baseUrl= "http://newtours.demoaut.com/";
	String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";

	public WebDriver driver;
	
	@Test(priority=1)
	public void verifyHomepageTitle1()
	{
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver=new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle="Welcome : Mercury Tours123";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		
		driver.close();
	}
	
	
}
