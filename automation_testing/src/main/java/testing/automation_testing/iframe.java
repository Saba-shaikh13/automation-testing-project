package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
	}

		void frame()
		{
//			WebElement w=driver.findElement(By.id("singleframe"));
//			driver.switchTo().frame(w);//by using webelement
//			driver.findElement(By.tagName("input")).sendKeys("soniya");
			
			//by using index
			driver.switchTo().frame(0);
			driver.findElement(By.tagName("input")).sendKeys("saher");

//			by using id
			driver.switchTo().frame("singleframe");
			driver.findElement(By.tagName("input")).sendKeys("saher");

		}
	
	public static void main(String[] args) {
		iframe obj=new iframe();
		obj.launch();
		obj.frame();
		
	}
}
