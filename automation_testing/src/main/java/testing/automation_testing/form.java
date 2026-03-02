package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void section1()
	{
	driver.findElement(By.id("input1")).sendKeys("Selenium is a tool used to test websites automatically.");	
	driver.findElement(By.id("btn1")).click();
	}
 void section2()
 {
		driver.findElement(By.id("input2")).sendKeys("Selenium is a tool used to test websites automatically");
		driver.findElement(By.id("btn2")).click();
 }
 void section3()
 {
		driver.findElement(By.id("input3")).sendKeys("Selenium is a tool used to test websites automatically");
		driver.findElement(By.id("btn3")).click();
 }
 void footer()
 {
	 driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[1]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[2]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[3]/a")).click();

	 }
 void shadow()
 {
	
	 WebElement shadowHost = driver.findElement(By.id("shadow_host"));
	 SearchContext shadowRoot = shadowHost.getShadowRoot();
	 shadowRoot.findElement(By.cssSelector("a")).click();
	 shadowRoot.findElement(By.cssSelector("input:nth-of-type(1)")).click();
	 shadowRoot.findElement(By.cssSelector("input:nth-of-type(2)")).click();
	 WebElement img = shadowRoot.findElement(By.cssSelector("input[type='file']"));
	 img.sendKeys("C:\\Users\\SK Laptop Town\\Desktop\\colors.jpg");	 
	 driver.findElement(By.xpath("//*[@id=\"HTML16\"]/div[1]/a")).click();

 }
 public static void main(String[] args) {
	form obj=new form();
	obj.launch();
//	obj.section1();
//	obj.section2();
//	obj.section3();
//	obj.footer();
	obj.shadow();
}
}
