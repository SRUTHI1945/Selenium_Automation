package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;
	ReadConfig conf;
	LoginPage lp;

	@BeforeTest
	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
//        driver = new ChromeDriver(option);	
//		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		conf = new ReadConfig();
		driver.get(conf.getAppURL());

		// create an page Object
		lp = new LoginPage(driver);

	}

	@AfterMethod
	public void delayAfterEachMethod() {

		// delay ----- all methods
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();

	}

}
