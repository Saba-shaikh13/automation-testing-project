package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void search()
	{
		WebElement search=driver.findElement(By.cssSelector("textarea[jsname='yZiJbe']"));
		search.sendKeys("Automation Testing");
		search.sendKeys(Keys.ENTER);
	}
	public static void main(String[] args) {
		search obj=new search();
		obj.launch();
		obj.search();
	}
}
