package testing.automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {
public static void main(String[] args) {
//	1.configure web driver.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\DriverResources\\chromedriver.exe");
    System.out.println("1.configure chromedriver");
//    2.intialize the chrome driver
    ChromeDriver driver=new ChromeDriver();
    System.out.println("2.Initialize chromedriver");
    
//    3.pass url of  web application to launch.
    driver.get("https://www.fortunecloudindia.com");
    System.out.println("3.launch website");
    driver.close();
}
}
