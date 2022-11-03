package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest_WebDriverManager_Config {

	WebDriver driver;

	@Test
	public void verifySearchTest() throws Exception {

		// application URL
		// browser

		// create an object
		ReadConfig conf = new ReadConfig();
		String browser = conf.getBrowser();
		String URL = conf.getAppURL();

		System.out.println("Application URL : " + URL + " and browser details are: " + browser);


//      WebDriverManager.chromedriver().setup();
//      WebDriver driver = new ChromeDriver();


//      WebDriverManager.edgedriver().setup();
//      WebDriver driver = new EdgeDriver();

		// cross browser testing

		if (browser.equalsIgnoreCase("CHROME")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {

			// default browser

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.get(URL);

		Thread.sleep(5000);

		// locator - id

		String searchItem = "iphone 14";

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);

		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);

		String actualTitle = driver.getTitle();
		System.out.println("Title :" + actualTitle);

		Assert.assertTrue(actualTitle.contains(searchItem));
		Assert.assertEquals("Amazon.in : iphone 14", actualTitle);
		Assert.assertEquals("Amazon.in : " + searchItem, actualTitle);

		Thread.sleep(5000);

		driver.close();
	}

}
