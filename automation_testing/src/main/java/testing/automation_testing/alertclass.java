package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class alertclass {
	ChromeDriver driver;

	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	public static void main(String[] args) {
		alertclass obj=new alertclass();
		obj.launch();
	}

}
