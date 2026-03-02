package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class window {
	ChromeDriver driver;
	
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
	}
	void test_window()
	{
	    WebElement w=driver.findElement(By.linkText("click"));
	    w.click();
	    w.sendKeys(Keys.CONTROL+"w");
		WebElement Nw=driver.findElement(By.cssSelector("a[href='#Seperate']"));
		Nw.click();
		Nw.sendKeys(Keys.CONTROL+"w");

		
		WebElement	 Mw=driver.findElement(By.cssSelector("a[href='#Multiple']"));
		Mw.click();
		driver.findElement(By.cssSelector("button[onclick='multiwindow()']")).click();

	}
	public static void main(String[] args) {
		window obj=new window();
		obj.launch();
		obj.test_window();
	}
}
