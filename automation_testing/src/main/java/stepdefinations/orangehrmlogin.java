package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
public class orangehrmlogin {
	ChromeDriver driver;
	@Given("user should launch the website")
	  public void launch() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Precondition: orangehrm website is launch");
	}
	@When("launch the website,enter valid email and password,click on orangehrm login button")
	 public void login_step() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		System.out.println("Test steps: user performed all steps");
	}
	@And(" orangehrm login should be successfull")
	 public void login_button() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		System.out.println("Expected result:login successful");
		System.out.println(driver.getCurrentUrl());


	}
	@And("logout orangehrm website should be successfull")
	 public void logout() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		System.out.println("logout successful");

	}
	@Then("close browser successfuly")
	public void validate()
	{
		
		driver.close();

	}
	
}
