package testNGdemos;

import org.testng.annotations.Test;

public class group_Ing
{
  @Test (groups = { " Scooter "})
  public  void Scooter1()
  {
	  System.out.println("Batch Scooter - Test Scooter 1");
  }
  @Test (groups = {"Car"})
  public void CarTest()
  {
	  System.out.println("Batch Scooter - Test Scooter 2");
  }
  
  @Test (groups = { "Scooter" })
  public void Scooter2()
  {
	  System.out.println("Batch Scooter - Test Scooter 2");
  }
  
  @Test (groups = { "Car", "Sedan Car"})
  public void Sedan1()
  {
	  System.out.println("Batch Sedan Car - Test Sedan 1");
  }
}
