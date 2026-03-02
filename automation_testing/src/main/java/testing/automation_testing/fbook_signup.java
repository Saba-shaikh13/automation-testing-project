package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbook_signup {
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
		driver.findElement(By.cssSelector(" input[name='firstname']")).sendKeys("saher");
		driver.findElement(By.cssSelector(" input[name='lastname']")).sendKeys("shaikh");
	
		sel=new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(8);
		sel=new Select(driver.findElement(By.id("month")));
		sel.selectByIndex(9);
		sel=new Select(driver.findElement(By.id("year")));
		sel.selectByVisibleText("2002");
		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.cssSelector(" input[name='reg_email__']")).sendKeys("sabanshaikh2002@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123345");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//		driver.findElement(By.linkText("Already have an account?")).click();
	}
	public static void main(String[] args) {
		fbook_signup ob=new fbook_signup();
		ob.launch();
		ob.signup();
	}

}
