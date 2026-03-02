package testing.automation_testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestediframe {

    ChromeDriver driver;

    void launch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    void frame() {

        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        WebElement NF1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(NF1);

        WebElement NF2 = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(NF2);
        driver.findElement(By.tagName("input")).sendKeys("soniya");

      
    }

    public static void main(String[] args) {
        nestediframe obj = new nestediframe();
        obj.launch();
        obj.frame();
    }
}
