package testing.automation_testing;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testalert {
	ChromeDriver driver;
	Actions acl;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	void mousehover()throws InterruptedException
	{   
	     acl=new Actions(driver);
	     WebElement al1=driver.findElement(By.linkText("SwitchTo"));
	     acl.moveToElement(al1).build().perform();
	     al1=driver.findElement(By.linkText("Alerts"));
	     acl.moveToElement(al1).build().perform();
	     al1.click();
	     driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
	     Alert al3=driver.switchTo().alert();
			Thread.sleep(1000);
			al3.accept();
	}
	void ok_cancel_alert() throws InterruptedException
	{
		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();
		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(1000);
		al2.accept();
		
        driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();
		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		Alert al4=driver.switchTo().alert();
		Thread.sleep(1000);
		al4.dismiss();
		
		
	}
	void prompt_alert()
	{
		 driver.findElement(By.cssSelector("a[href='#Textbox']")).click();
			driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
			Alert al5=driver.switchTo().alert();
			al5.accept();
			
			 driver.findElement(By.cssSelector("a[href='#Textbox']")).click();
				driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
				Alert al6=driver.switchTo().alert();
				al6.dismiss();
				
			
	}
	public static void main(String[] args) throws InterruptedException{
		testalert obj=new testalert();
		obj.launch();
		obj.mousehover();
		obj.ok_cancel_alert();
		obj.prompt_alert();
	}
}
