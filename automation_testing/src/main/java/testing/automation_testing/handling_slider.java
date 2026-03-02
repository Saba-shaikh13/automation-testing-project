package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_slider {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void left_slider() {
		WebElement left=driver.findElement(By.cssSelector("span[tabindex='0']"));
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(left, 120, 0).build().perform();
	}
	void right_slider()
	{
		WebElement right=driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(right, 150, 0).build().perform();
	}
	public static void main(String[] args) {
		handling_slider obj=new handling_slider();
		obj.launch();
//		obj.left_slider();
		obj.right_slider();
	}
}
