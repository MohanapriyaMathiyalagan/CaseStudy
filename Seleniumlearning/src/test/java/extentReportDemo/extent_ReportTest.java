package extentReportDemo;

import java.net.Inet4Address;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_ReportTest
{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	
	WebDriver driver;
	@BeforeTest
	public void startReport() throws Exception
	{
		System.out.println(System.getProperty("user.dir"));
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent - reports/"+ new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "GFT NextGen Testing Stream");
		extent.setSystemInfo("Environment", "Automation testing - Selenium");
		extent.setSystemInfo("User Name", "BMC");
		
		htmlReporter.config().setDocumentTitle("Reports - Extents - GFT");
		htmlReporter.config().setReportName("Execution report - Mercury Tours");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		Inet4Address inet= (Inet4Address) Inet4Address.getLocalHost();
		extent.setSystemInfo("System Host Address", " : " + inet.getHostAddress());
		extent.setSystemInfo("System Host NAme is", " : "+ inet.getHostName());
		System.out.println("Host Address" + inet.getHostAddress());
		System.out.println("Host NAme is"+ inet.getHostName());
	}

	
	@Test
	public void passTest()
	{
		logger = extent.createTest("passTest");
		Assert.assertTrue(true);
		logger.log(Status.PASS, MarkupHelper.createLabel("Test Case passed is passTest", ExtentColor.GREEN));
	}
	
	@Test
	public void failTest()
	{
		logger = extent.createTest("failTest");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void skipTest()
	{
		logger = extent.createTest("skipTest");
		throw new SkipException("Skipping - This is not ready for Testing");
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" - Test case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+" - Test case Failed", ExtentColor.RED));
		}
		
		else if(result.getStatus() == ITestResult.SKIP)
		{
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" - Test case Skipped", ExtentColor.ORANGE));

		}
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
}
