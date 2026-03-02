package testing.automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) {
	fb_launch();
}
static void fb_launch()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
 System.out.println("1.configure");
 ChromeDriver driver=new ChromeDriver();
 System.out.println("initilize chromedriver");
 driver.get("https://www.facebook.com/");
 System.out.println("launch website");
 driver.manage().window().maximize();
 System.out.println("maximize window");
 
 driver.close();
 System.out.println("browser close");
}
}
