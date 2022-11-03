package handleSync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void Launchapp() {
		
		System.out.println("launching app....");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
        //implicit delay
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 

//		driver.get("https://paytm.com/");
//		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	}

	@AfterTest
	public void CloseApp() {
		driver.close();
		System.out.println("closing app....");


	}
}
