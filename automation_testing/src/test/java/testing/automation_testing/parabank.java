package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {
	ChromeDriver driver;
	void launch()

	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	void register()
	{
		driver.findElement(By.id("customer.firstName")).sendKeys("abc123");
		driver.findElement(By.id("customer.lastName")).sendKeys("@#$56");
		driver.findElement(By.id("customer.address.street")).sendKeys("");
		driver.findElement(By.id("customer.address.city")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("");
		driver.findElement(By.id("customer.address.state")).sendKeys("");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1122334455566");
		driver.findElement(By.id("customer.ssn")).sendKeys("68660066");
		driver.findElement(By.id("customer.username")).sendKeys("a b c");
		driver.findElement(By.id("customer.password")).sendKeys("1234@#$");
		driver.findElement(By.id("repeatedPassword")).sendKeys("@#$1234");
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

	}
	public static void main(String[] args) {
		parabank obj=new parabank();
		obj.register();
	}
}
