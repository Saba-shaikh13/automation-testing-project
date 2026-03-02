package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class colors extends launch_setup{
	Select sel;
void colors() {
	 sel=new Select(driver.findElement(By.id("colors")));

	 sel.selectByVisibleText("Blue");
	 
}
void sorted()
{
	sel=new Select(driver.findElement(By.id("animals")));
	sel.selectByVisibleText("Cheetah");

}
public static void main(String[] args) {
	colors c=new colors();
	c.launch();
	c.colors();
	c.sorted();
}

}
