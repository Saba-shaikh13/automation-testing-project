package testing.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4822210585679815778&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	void mousehover()
	{
		Actions act=new Actions(driver);
	WebElement Fresh=driver.findElement(By.xpath("//span[text()='frash']"));
		act.moveToElement(Fresh).build().perform();
	}
	public static void main(String[] args) {
		 actionclass obj = new actionclass();
		 obj.launch();
		 obj.mousehover();
		
	}

}
