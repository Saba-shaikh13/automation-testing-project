package testing.automation_testing;

import org.testng.annotations.Test;

public class priority_task {
	@Test(priority=1)
void task1()
{
 System.out.println("first task");
}
	@Test (groups="smoketesting")
void task2()
{
 System.out.println("second task");
}
	@Test(priority=3)
void task3()
{
 System.out.println("third task");
}
}
