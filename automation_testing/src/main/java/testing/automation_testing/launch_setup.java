package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_setup {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}
