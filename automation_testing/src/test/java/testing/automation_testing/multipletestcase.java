package testing.automation_testing;

import org.testng.annotations.Test;

public class multipletestcase {
	@Test (groups="smoketesting")
void food()
{
System.out.println("healthy food is the best");	
}
	@Test
	void fashon()
	{
	System.out.println("traditional wear never goes out of style");	
	}@Test
	void Stationary()
	{
	System.out.println("A place of creativity");	
	}@Test
	void grocery()
	{
	System.out.println("grocery is the prerequiste for all things");	
	}
}
