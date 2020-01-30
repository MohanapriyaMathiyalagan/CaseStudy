package testNGdemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest {
  @Test(enabled=false,priority=1)
  public void validate_Sign_on()
  {
	  System.out.println("Validating Sign_on");
	  
  }
  @Test(priority=5)
  public void validate_Register()
  {
	  System.out.println("Validating Register");
  }
  @Test(priority=3)
  public void validate_Support()
  {
	  System.out.println("Validating Support");
  }
  @Test(enabled=false)
  public void validate_Contact()
  {
	  System.out.println("Validating Contact");
  }
  
  @BeforeClass
  public void open_Browser()
  {
	  System.out.println("*** Opening Browser ***");
  }
  
  @AfterClass
  public void close_Browser()
  {
	  System.out.println("*** Closing Browser ***");
  }
  
  @BeforeMethod
  //@ITestListener
  public void Home_Page()
  {
	  System.out.println("### Home page ###");
  }
  
  @AfterClass
  public void Sign_Out()
  {
	  System.out.println("### Signing Out ###");
  }
}
