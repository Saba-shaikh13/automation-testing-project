package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void dynamic_button()
	{
		driver.findElement(By.xpath("//button='start']")).click();
	}
	void double_click()
	{

		Actions act = new Actions(driver);
		WebElement copyText =driver.findElement(By.xpath("//button[@name='start']"));

		act.doubleClick(copyText).build().perform();
	}
	public static void main(String[] args) {
		task obj=new task();
		obj.launch();
//		obj.double_click();
     	obj.dynamic_button();
	}
}
