package basicAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module2
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("before module");
	}
	@BeforeMethod
	public void beforetestScript()
	{
		System.out.println("Before test script");
		
	}
	@AfterMethod
	public void aftertestscript()
	{
		System.out.println("after test script");
	}
	@Test
public void test12()
{
	
	System.out.println("login test case");
	
}
@Test
public void test2()
{
	System.out.println("logout test case");
}
public void beforeSuite()
{
	System.out.println("Before suite");
}
public void afterSuite()
{
	System.out.println("After suite");
}
}


