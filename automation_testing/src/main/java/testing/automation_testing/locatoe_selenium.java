package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoe_selenium {
	ChromeDriver driver;
	void launch_setup()
	{
	    driver=new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 System.out.println("launch website");
		 driver.manage().window().maximize();
	}
	void xpath_locator()
	{
//		driver.findElement(By.xpath("//a[@id='ignin2']")).click();
//		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("abc");
		//2.//parenttagname/childtagname
//		driver.findElement(By.xpath("//li/a")).click();
//		3.tagname
//		driver.findElement(By.xpath("//img")).click();
//	   4. //tagname[text()='value']
//		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
//		5.//tagname[containts(text(),'value')]
        driver.findElement(By.xpath("//a[contains( text(),'Samsung galaxy s6')]")).click();


	}
	void css_locator()
	{
//		1. tagname[attribute =value]
//		driver.findElement(By.cssSelector("a[id='login2']")).click();
//		driver.findElement(By.cssSelector("input[id='loginusername']")).sendKeys("saba");
//		driver.findElement(By.cssSelector("input[id='loginpassword']")).sendKeys("123");
//		driver.findElement(By.cssSelector("button[text()='Log in']")).click();
//		2.tagname#idvalue.
//		3.tagname.classname
//		driver.findElement(By.cssSelector("button.btn btn-primary")).click();
//4.tagname
//		driver.findElement(By.cssSelector("img")).click();

	}
	
public static void main(String[] args) {
	locatoe_selenium obj=new locatoe_selenium();
	obj.launch_setup();
	obj.xpath_locator();
//	obj.css_locator();
	
}
}
