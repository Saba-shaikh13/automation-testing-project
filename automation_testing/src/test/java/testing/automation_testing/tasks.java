package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tasks {
	ChromeDriver driver;
	@Test(priority=1)
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
@Test(priority=2)
	void invalid_login_pass()
	{
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Pass123");
		driver.findElement(By.id("submit")).click();
	}
}
