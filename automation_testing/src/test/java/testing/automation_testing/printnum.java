package testing.automation_testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class printnum {
@Parameters({"S"})
@Test
	void display(int num)
	{
		System.out.println("The number is:"+num);
	}
}
