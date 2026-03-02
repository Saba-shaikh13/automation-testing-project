package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void practice_form()
	{
		driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("textarea")).sendKeys("abc");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("saturday")).click();
//		to handle dropdown
		Select sel=new Select(driver.findElement(By.id("country")));
//		selectbyindex
		sel.selectByIndex(9);	

	}
	public static void main(String[] args) {
		selectclass obj = new selectclass();
		obj.launch();
		obj.practice_form();
	}
}
