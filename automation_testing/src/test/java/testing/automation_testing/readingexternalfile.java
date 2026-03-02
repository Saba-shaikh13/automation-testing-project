package testing.automation_testing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readingexternalfile {
	@Test
	void file_read() throws IOException
	{ 
		FileReader fr=new FileReader("C:\\Users\\SK Laptop Town\\sabacorejava\\automation_testing\\websites.properties");
         Properties pr=new Properties();
       pr.load(fr);
       ChromeDriver driver=new ChromeDriver();
       driver.get(pr.getProperty("orangehrm"));
       driver.manage().window().maximize();
	}
}
