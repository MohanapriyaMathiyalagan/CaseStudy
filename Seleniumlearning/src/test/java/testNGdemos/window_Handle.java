package testNGdemos;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_Handle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
		
		
		String MainWindow=driver.getWindowHandle();
		System.out.println("Main window unique no"+MainWindow);
		
		//To handle all new opened window
		Set<String> s1=driver.getWindowHandles();
		
		for (String string : s1)
		{
			String secondWindow=string;
			
			System.out.println("Second window unique no"+secondWindow);
			
			//Switching to second window
			driver.switchTo().window(secondWindow);
			
		}
		
		driver.findElement(By.name("emailid")).sendKeys("abc@a.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
		//Switching to Main window
		
		driver.switchTo().window(MainWindow);

	}

}
