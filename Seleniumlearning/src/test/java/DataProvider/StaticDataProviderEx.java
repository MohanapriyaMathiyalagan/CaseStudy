package DataProvider;

import org.testng.annotations.Test;

public class StaticDataProviderEx
{
	@Test(dataProvider = "dp", dataProviderClass=twoDimensions.class)
	public void client1Test(Integer i, String s)
	{
		System.out.println("Client1 testing: Data(" +i+" , "+" String is"+" - "+s+")" );
	}
	
	@Test(dataProvider = "dp", dataProviderClass = twoDimensions.class)
	public void client2Test(Integer i1, String s1)
	{
		System.out.println("Client2 testing: Data(" +i1+" , "+" String is"+" - "+s1+")");
	}
}
