package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
class demo_siteparent{
	ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
public class demo_site extends demo_siteparent {
	
	void registration()
	{
		driver.findElement(By.cssSelector("input[id='vfb-5']")).sendKeys("Saher");
		driver.findElement(By.cssSelector("input[id='vfb-7']")).sendKeys("shaikh");
		driver.findElement(By.cssSelector("input[value='Female']")).click();
     	driver.findElement(By.cssSelector("input[name='vfb-20[]']")).click();
		driver.findElement(By.cssSelector("input[value='Java']")).click();
		driver.findElement(By.cssSelector("input[value='Functional Testing']")).click();
		driver.findElement(By.cssSelector("input[id='vfb-13-address']")).sendKeys("abcnagar");
		driver.findElement(By.cssSelector("input[id='vfb-13-address-2']")).sendKeys("abcroad 123");
		driver.findElement(By.cssSelector("input[id='vfb-13-city']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name='vfb-13[state]']")).sendKeys("maharastra");
		driver.findElement(By.cssSelector("input[name='vfb-13[zip]']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[7]/span/span[1]/span/span[2]")).click();
       WebElement country= driver.findElement(By.xpath("/html/body/span[2]/span/span[1]/input"));
       country.sendKeys("India");
       country.click();
        driver.findElement(By.cssSelector("input[name=vfb-14]")).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector("input[name='vfb-18']")).click();

	    driver.findElement(By.cssSelector("a[data-date='8']")).click();
        WebElement H=driver.findElement(By.xpath("//*[@id=\"item-vfb-16\"]/span[1]/span/span[1]/span/span[2]"));
        H.click();
		WebElement S=driver.findElement(By.id("select2-vfb-16-hour-container"));
		S.sendKeys("01");
		driver.findElement(By.xpath("//*[@id=\"item-vfb-16\"]/span[2]/span/span[1]/span/span[2]")).click();

		driver.findElement(By.id("select2-vfb-16-min-container")).sendKeys("30");
		
		driver.findElement(By.cssSelector("input[name='vfb-19']")).sendKeys("12345667890");
		driver.findElement(By.cssSelector("textarea[id='vfb-23']")).sendKeys("no quary");
		driver.findElement(By.cssSelector("input[name='vfb-3']")).sendKeys("50");
		driver.findElement(By.cssSelector("button[name='vfb-submit']")).click();

	}
public static void main(String[] args) {
	demo_site obj=new demo_site();
	obj.launch();
	obj.registration();
}
}
