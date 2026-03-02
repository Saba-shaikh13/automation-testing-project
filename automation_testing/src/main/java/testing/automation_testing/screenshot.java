package testing.automation_testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	ChromeDriver driver;
	void launch() throws InterruptedException
	{
	    driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
	}
	void take_screenshot() throws IOException
	{
		
		File ts=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SK Laptop Town\\Desktop\\Testing\\filpcartdashboard.jpg");
		FileHandler.copy(ts, dest);
	}
	void partial_screenshot() throws IOException
	{   
		WebElement img=driver.findElement(By.xpath("\\img[@alt=''FLIPKART]"));
		File src=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\filpcart.jpg");
		FileHandler.copy(src, destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		screenshot obj=new screenshot();
		obj.launch();
//		obj.take_screenshot();
		obj.partial_screenshot();
	}
}
