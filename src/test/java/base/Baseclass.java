package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	 public static WebDriver driver;
	
	 @BeforeTest
     public void setUp()
     {

   	

                 driver = new ChromeDriver();



                 driver.get("https://www.facebook.com");



                 driver.manage().window().maximize();


               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

     }

}
