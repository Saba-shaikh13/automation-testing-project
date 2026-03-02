package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class
Alertinterface {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	void simple_alert()
	{   
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}
	void confirmation_alert() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("confirmation")).click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(1000);
		al2.accept();//press ok
		
		
		driver.findElement(By.partialLinkText("confirmation")).click();
		Alert al3=driver.switchTo().alert();
		Thread.sleep(1000);
		al3.dismiss();//press cancel
	}
	void prompt_alert()
	{
		driver.findElement(By.partialLinkText("confirmation")).click();
		Alert al4=driver.switchTo().alert();
		al4.dismiss();
	}
	public static void main(String[] args) throws InterruptedException{
		Alertinterface obj=new Alertinterface();
		obj.launch();
		obj.simple_alert();
		obj.confirmation_alert();
		obj.prompt_alert();
	}
}
