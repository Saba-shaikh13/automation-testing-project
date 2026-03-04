package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalid_fb_login {
	ChromeDriver driver;
	@Given("chrome browser should be invoked")
public void browser()
{
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 driver.manage().window().maximize();
	 	
}
	@And("fb login page should be visible")
	public void fb_loginpage()
	{
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();		 	
	}

	@When("Enter username {string} and password {string}")
public void fb_invalid_credentials(String uname,String pass)
{
		 driver.findElement(By.name("email")).sendKeys(uname);
		 driver.findElement(By.name("pass")).sendKeys(pass);

}
	@And("user click on login button on fb login page")
public void click_login()
{
		 driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
}

	@Then("login failed when user enter invalid credentials")
public void result_of_login()
{
		System.out.println("login failed");
	}
}
