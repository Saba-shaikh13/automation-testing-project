package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class login_demoblaze {
	public static void main(String[] args) throws InterruptedException {
		valid_login();
	}
	static void valid_login() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\msedgedriver.exe");
		 System.out.println("1.configure");
		 EdgeDriver driver=new EdgeDriver();
		 System.out.println(" 2.initialize edgedriver");
		 driver.get("https://www.demoblaze.com/");
		 System.out.println("3.launch website");
		 driver.manage().window().maximize();
		 System.out.println("4.maximize window");
		 System.out.println("5.click on log in");
		 driver.findElement(By.id("login2")).click();
		 driver.findElement(By.id("loginusername")).sendKeys("saher");
		 System.out.println("enter username");
		 driver.findElement(By.id("loginpassword")).sendKeys("123");
		 System.out.println("enter password");
	     driver.findElement(By.xpath("//button[text()='Log in']")).click();
	     Thread.sleep(10000);
		 driver.close();
		 System.out.println(" 6.close");

	}


}
