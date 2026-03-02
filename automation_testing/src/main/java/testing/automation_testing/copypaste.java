package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypaste {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void copytext_paste()
	{
		WebElement fname=driver.findElement(By.cssSelector("input[name='firstname']"));
		fname.sendKeys("soniya");
		fname.sendKeys(Keys.CONTROL+"A");
		fname.sendKeys(Keys.CONTROL+"C");
		WebElement lname=driver.findElement(By.cssSelector("input[name='lastname']"));
		lname.sendKeys(Keys.CONTROL+"V");
	}
	public static void main(String[] args) {
		copypaste obj=new copypaste();
		obj.launch();
		obj.copytext_paste();
	}
}
