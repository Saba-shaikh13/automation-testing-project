package testing.automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class file_uploads extends launch_setup {
	 void single_file() throws InterruptedException{
		WebElement img=driver.findElement(By.id("singleFileInput"));
		img.sendKeys("C:\\Users\\SK Laptop Town\\Desktop\\colors.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
//		driver.close();
	}
	 void multiple_file()throws InterruptedException
	 {
		driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\SK Laptop Town\\Desktop\\colors.jpg\n" + "C:\\Users\\SK Laptop Town\\Desktop\\home.jpg\n" +" C:\\Users\\SK Laptop Town\\Desktop\\login.jpg");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
//			driver.close(); 
	 }
public static void main(String[] args) throws InterruptedException {
	file_uploads obj=new file_uploads();
	obj.launch();
//	obj.single_file();
	obj.multiple_file();
}
}
