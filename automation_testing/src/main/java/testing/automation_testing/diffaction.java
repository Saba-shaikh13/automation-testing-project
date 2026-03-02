package testing.automation_testing;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class diffaction {
	ChromeDriver driver;
	 Actions act;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
 void Mousehover()
 {
	  act=new Actions(driver);
	 WebElement pointsme=driver.findElement(By.xpath("//button[text()='Point Me']"));
	 act.moveToElement(pointsme).build().perform();
 }
 void dragdrop()
 {
	 WebElement drag=driver.findElement(By.id("draggable"));
	 WebElement drop=driver.findElement(By.id("droppable"));
	 act.dragAndDrop(drag,drop).build().perform();
 }
 public static void main(String[] args) {
	diffaction obj=new  diffaction();
	obj.launch();
	obj.Mousehover();
	obj.dragdrop();
	
 }
}
