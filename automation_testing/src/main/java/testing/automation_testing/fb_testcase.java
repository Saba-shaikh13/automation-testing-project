package testing.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_testcase {
	 ChromeDriver driver;

void launch_fb()
{
    driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login");
	 System.out.println("launch website");
	 driver.manage().window().maximize();

}
void invalid_loginID() {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
	 System.out.println("1.configure");
     driver=new ChromeDriver();
//	 System.out.println("initilize chromedriver");
//	 driver.get("https://www.facebook.com/login");
//	 System.out.println("launch website");
//	 driver.manage().window().maximize();

	 driver.findElement(By.id("email")).sendKeys("123@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("123");
	 driver.findElement(By.id("loginbutton")).click();
	 System.out.println("using id");
	 
}
void invalid_loginNAME() {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
//	 System.out.println("1.configure");
////	 driver=new ChromeDriver();
//	 System.out.println("initilize chromedriver");
//	 driver.get("https://www.facebook.com/login");
//	 System.out.println("launch website");
//	 driver.manage().window().maximize();
//	 System.out.println("maximize window");
	 driver.findElement(By.name("email")).sendKeys("sab@gmail.com");
	 driver.findElement(By.name("pass")).sendKeys("123");
	 driver.findElement(By.name("login")).click();
	 System.out.println("using Tagname");
	
}
void invalid_loginTagName() {

	 driver.findElement(By.id("pass")).sendKeys("123");
	 driver.findElement(By.tagName("button")).click();
	 System.out.println("using Name");
	
}

void forget_passlinktext()
{
driver.findElement(By.linkText("Forgotten account?")).click();	
driver.navigate().back();
}
void partial_linltext()
{
driver.findElement(By.partialLinkText("Forgotten")).click();	
}
void classname()
{
driver.findElement(By.className(null)).click();	
}
public static void main(String[] args) {
	fb_testcase obj=new fb_testcase();
//	obj.invalid_loginID();
//	obj.invalid_loginNAME();
    obj.launch_fb();
    obj.forget_passlinktext();
    obj.partial_linltext();
}
}
