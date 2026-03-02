package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardaction {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void search()
	{
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		search.sendKeys("software testing");
		search.sendKeys(Keys.ENTER);
	}
	void copypaste()
	{
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("soniya");
		name.sendKeys(Keys.CONTROL+"A");
		name.sendKeys(Keys.CONTROL+"C");
		WebElement mail=driver.findElement(By.id("email"));
		mail.sendKeys(Keys.CONTROL+"V");
	}
	void delete() {
		WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		se.sendKeys("java");
		se.sendKeys(Keys.CONTROL+"A");
		se.sendKeys(Keys.DELETE);
	

	}
	public static void main(String[] args) {
		keyboardaction obj=new keyboardaction();
		obj.launch();
		obj.copypaste();
		obj.delete();
	}
}
