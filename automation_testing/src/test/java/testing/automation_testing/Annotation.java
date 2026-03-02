package testing.automation_testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation {
	@AfterSuite
void After_suite()
{
	System.out.println("@Aftersuite");
} 
	@BeforeSuite
	void Before_suite()
	{
		System.out.println("@BeforeSuite");
	}
@Test  (groups="smoketesting")
void Test()
	{
		System.out.println("@Test");
	}
}
