package testing.automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class method_seleninum {
	public static void main(String[] args) {
		methods();
	}
	static void methods()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
	 System.out.println("1.configure");
	 ChromeDriver driver=new ChromeDriver();
	 System.out.println("initilize chromedriver");
	 driver.get("https://www.facebook.com/");
	 System.out.println("current url:"+driver.getCurrentUrl());
	 System.out.println("title:"+driver.getTitle());
	 driver.navigate().to("https://www.google.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.close();


	
	}
}
