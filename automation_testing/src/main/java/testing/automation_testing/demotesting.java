package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demotesting {
	ChromeDriver driver;
	Select sel;
	void launch()
	{
		driver =new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
	}
 void register_form()
 {
	 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("saher");
	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("shaikh");
	 driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("abcnagar");
	 driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("abc@gamile.com");
	 driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("1234675890");
	 driver.findElement(By.cssSelector("input[value='FeMale']")).click();
	 driver.findElement(By.cssSelector("input[value='Cricket']")).click();
	 driver.findElement(By.cssSelector("input[value='Movies']")).click();
//	 driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("english");
	  sel=new Select(driver.findElement(By.id("Skills")));
	 sel.selectByIndex(10);
	  sel=new Select(driver.findElement(By.id("countries")));
	  sel=new Select(driver.findElement(By.id("country")));
	  sel.selectByValue("India");
	  sel=new Select(driver.findElement(By.id("yearbox")));
	  sel.selectByVisibleText("2002");
	  sel=new Select(driver.findElement(By.cssSelector("select[placeholder='Month']")));
	  sel.selectByValue("August");
	  sel=new Select(driver.findElement(By.id("daybox")));
	  sel.selectByIndex(8);
	  driver.findElement(By.id("firstpassword")).sendKeys("12345");
	  driver.findElement(By.id("secondpassword")).sendKeys("12345");
//      driver.findElement(By.cssSelector("input[id='imagesrc']")).click();
	  driver.findElement(By.xpath("// button[@id='submitbtn']")).click();
//       driver.findElement(By.id("Button1")).click();
 }
 
 public static void main(String[] args) {
	demotesting obj=new demotesting();
	obj.launch();
	obj.register_form();

}
}
