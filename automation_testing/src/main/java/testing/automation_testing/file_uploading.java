package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class launch_demo{
	ChromeDriver driver;
	Actions acl;
	void launch()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
}
public class file_uploading extends launch_demo {
	void file() {
		WebElement img=driver.findElement(By.id("imagesrc"));
		img.sendKeys("C:\\Users\\SK Laptop Town\\Desktop\\Testing\\filpcartdashboard.jpg");
		driver.close();
	}
public static void main(String[] args) {
	file_uploading ob=new file_uploading();
	ob.launch();
	ob.file();
}
}
