package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void newtab()
	{
		WebElement w_page=driver.findElement(By.linkText(".in"));
		w_page.sendKeys(Keys.CONTROL+"t");
		driver.navigate().to("https://www.unipune.ac.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");

	}
	void newwindow()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.amazon.in/");
		driver.quit();
	}
}
