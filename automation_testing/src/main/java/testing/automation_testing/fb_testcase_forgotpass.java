package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_testcase_forgotpass {
	ChromeDriver driver;
	void launch_fb()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		 System.out.println("launch website");
		 driver.manage().window().maximize();
	}
	void forgotpass()
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("saba@gmail.com");
		driver.findElement(By.linkText("Cancel")).click();
		
	}
	void fb_signup()
	{
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.navigate().back();
		driver.navigate().refresh();
	}
public static void main(String[] args) {
	fb_testcase_forgotpass obj=new fb_testcase_forgotpass();
	obj.launch_fb();
//	obj.forgotpass();
	
	
}
}
