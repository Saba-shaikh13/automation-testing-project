package testing.automation_testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class dataproviderannotation {
	 EdgeDriver driver;
  @Test(dataProvider = "data")
  public void tlogin_logout(String uname, String pass) {
	  
	  System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 driver.findElement(By.id("logout_sidebar_link")).click();
		
		
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] {"standard_user", "secret_sauce" },
      new Object[] { "locked_out_user","secret_sauce" },
      new Object[] { "problem_user","secret_sauce" },
      new Object[] { "performance_glitch_user","secret_sauce" },
      new Object[] { "error_user","secret_sauce" },
      new Object[] { "visual_user","secret_sauce" }


    };
  }
}
