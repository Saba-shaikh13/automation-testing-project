package testing.automation_testing;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class swag_lab {
	
	EdgeDriver driver;
	void launch()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\swaglabstest\\DriverResources\\msedgedriver.exe");
		 driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	void login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 driver.findElement(By.id("logout_sidebar_link")).click();
			
	}
		void login1()
		{
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 driver.findElement(By.id("logout_sidebar_link")).click();
				
		}
		void login2()
		{
			driver.findElement(By.id("user-name")).sendKeys("problem_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 driver.findElement(By.id("logout_sidebar_link")).click();
				
		}
		void login3()
		{
			driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 driver.findElement(By.id("logout_sidebar_link")).click();
				
		}
		void login4()
		{
			driver.findElement(By.id("user-name")).sendKeys("error_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 driver.findElement(By.id("logout_sidebar_link")).click();
				
		}
		void login5()
		{
			driver.findElement(By.id("user-name")).sendKeys("visual_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 driver.findElement(By.id("logout_sidebar_link")).click();
				
		}
		void close()
		{
			driver.quit();
		}

	public static void main(String[] args) {
		swag_lab obj=new swag_lab();
		obj.launch();
		obj.login();
		obj.login1();
		obj.login3();
		obj.login4();
		obj.login5();
		obj.close();
		
		
		
		
	}
}
