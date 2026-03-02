
package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_signup_negative {
	ChromeDriver driver;
	Select sel;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void signup()
	{   
		driver.findElement(By.cssSelector(" input[name='firstname']")).sendKeys("");
		driver.findElement(By.cssSelector(" input[name='lastname']")).sendKeys("shaikh");
	
		sel=new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(8);
		sel=new Select(driver.findElement(By.id("month")));
		sel.selectByIndex(9);
		sel=new Select(driver.findElement(By.id("year")));
		sel.selectByVisibleText("2002");
		driver.findElement(By.cssSelector("input[value='1']")).click();
//		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.cssSelector(" input[name='reg_email__']")).sendKeys("7719948609");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1233!@456");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//		driver.findElement(By.linkText("Already have an account?")).click();
	}
	public static void main(String[] args) {
		fb_signup_negative ob=new fb_signup_negative();
		ob.launch();
		ob.signup();
	}

}
