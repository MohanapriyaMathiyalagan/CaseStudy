package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mercuryToursDataProvider {
	@Test(dataProvider="dp")
	public void DataInfo(String user, String pwd, String confpwd)
	{
		// TODO Auto-generated method stub

		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\JARS\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.partialLinkText("REGISTER")).click();
		
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("confirmPassword")).sendKeys(confpwd);
		
	//	Thread.sleep(3000);
		driver.close();

}
	@DataProvider
	public Object[][] dp()
	{
		return new Object[][]
				{
					new Object[] { "ram", "ram123", "ram123" },
					new Object[] { "priya", "priya123", "priya123" },
					new Object[] { "miya", "miya123", "miya123" },
				};
	}
}
