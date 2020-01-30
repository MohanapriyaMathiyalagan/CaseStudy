package testNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class i_frame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.titleContains("Demo Guru99 Page"));
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();

	}

}
