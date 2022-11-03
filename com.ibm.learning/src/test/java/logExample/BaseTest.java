package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;
	ReadConfig conf;
	Logger log;

	@BeforeTest
	public void launchApp() throws Exception {

		log = Logger.getLogger("IBM_Login_Module");
		PropertyConfigurator.configure("./TestData/log4j.properties");

		log.info("chrome browser launched..");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		conf = new ReadConfig();

		log.info("launching application: " + conf.getAppURL());
		driver.get(conf.getAppURL());

	}

	@AfterTest
	public void closingApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
		log.info("closing application: ");

	}

}