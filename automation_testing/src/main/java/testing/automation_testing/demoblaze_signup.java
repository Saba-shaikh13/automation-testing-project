package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze_signup {
	public static void main(String[] args) {
		valid_signup();
	}
	static void valid_signup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
		 System.out.println("1.configure");
		 ChromeDriver driver=new ChromeDriver();
		 System.out.println("initilize chromedriver");
		 driver.get("https://www.demoblaze.com/");
		 System.out.println("launch website");
		 driver.manage().window().maximize();
		 System.out.println("maximize window");
		 driver.findElement(By.id("signin2")).click();
		 driver.findElement(By.id("sign-username")).sendKeys("saher");
		 driver.findElement(By.id("sign-password")).sendKeys("123");
	     driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		 driver.close();
	}

}
