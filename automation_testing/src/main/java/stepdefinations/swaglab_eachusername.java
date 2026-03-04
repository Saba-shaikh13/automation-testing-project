package stepdefinations;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class swaglab_eachusername {
	EdgeDriver driver;
	@Given("launch swaglab website")
	public void launch_swaglab_website() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\swaglabstest\\DriverResources\\msedgedriver.exe");
		 driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("enter username as standard_user and password as secret_sauce")
	public void enter_username_as_standard_user_and_password_as_secret_sauce(String uname,String pass) {
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}

	@Then("swaglab login should be successfull")
	public void swaglab_login_should_be_successfull() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
}
