package testing.automation_testing;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class blogspot{
	ChromeDriver driver;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
}
public class findelements extends blogspot {
	void broken() throws InterruptedException
	{
		List<WebElement> bk=driver.findElements(By.tagName("a"));
		for(WebElement li:bk)//iterating webelements
		{
			System.out.println(li.getText());
			Thread.sleep(1000);
		}
		driver.close();
	}
public static void main(String[] args) throws InterruptedException {
	findelements obj=new findelements();
	obj.launch();
	obj.broken();
}
}
