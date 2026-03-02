package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class datepicker extends launch_setup {
	Select sel;
	void data_picker1()
	{
		driver.findElement(By.id("datepicker")).click();
		 while (true) {
	            String monthYear = driver.findElement(
	                By.className("ui-datepicker-month")).getText();

	            if (monthYear.equals("August")) {
	                break;
	            }
	            driver.findElement(By.xpath("//a[@title='Next']")).click();
	        }
	      WebElement dat = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a"));
            dat.click();
	}
	void date_picker2()
	{
		WebElement date =driver.findElement(By.id("txtDate"));
		date.click();


		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a")).click();
	    sel=new Select(driver.findElement(By.className("ui-datepicker-month")));
	    sel.selectByIndex(9);
	    sel=new Select(driver.findElement(By.className("ui-datepicker-year")));
	    sel.selectByValue("2025");

	}
	void date_picker3()
	{
		driver.findElement(By.id("start-date")).sendKeys("01/02/2026");
		driver.findElement(By.id("end-date")).sendKeys("03/02/2035");
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();
	}
public static void main(String[] args) {
	datepicker obj=new datepicker();
	obj.launch();
//	obj.data_picker1();
	obj.date_picker2();
	obj.date_picker3();
	
}
}
