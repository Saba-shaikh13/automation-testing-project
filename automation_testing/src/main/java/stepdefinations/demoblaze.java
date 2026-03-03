package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;



public class demoblaze {
	ChromeDriver driver;
	@Given("launch demoblaze website")
public void launch()
{
	 driver=new ChromeDriver();
	 driver.get("https://www.demoblaze.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	
}
	@When("user click on sign up button")
public void signup()
{
	 driver.findElement(By.linkText("Sign up")).click();

}
	@And("user enter username ")
public void uername()
{
		 driver.findElement(By.id("sign-username")).sendKeys("saher");
}
	@And(" user enter password")
public void password()
{
		 driver.findElement(By.id("sign-password")).sendKeys("123");

}
	@And("click on signup button")
public void signupbutton()
{
    driver.findElement(By.xpath("//button[text()='Sign up']")).click();

}
	@Then("login should be successfull")
public void display_alert() throws InterruptedException
{
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println("Alert message:"+al.getText());
		al.accept();

	}
	@When("user click on login button ")
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
	}
	@And("user enter registered username and password")
	public void username_pass()
	{
		driver.findElement(By.id("loginusername")).sendKeys("saba");
		driver.findElement(By.id("loginpassword")).sendKeys("123");

	}
	@And(" click on login button")
	public void loginbutton()
	{
		driver.findElement(By.xpath("//button[onclick='logIn()']")).click();

	}
	@Then(" demoblaze login successfull")
	public void sucessful() {
		System.out.println("");
		 driver.close();

	}
}
