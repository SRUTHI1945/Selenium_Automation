package handleFrame;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	@Test
	public void verifySearchTest() throws Exception {

//      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
//      WebDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//      System.setProperty("webdriver.edge.driver", "C:\\Users\\Act\\Downloads\\edgedriver_win64_106\\msedgedriver.exe");
//      WebDriver driver = new EdgeDriver();    

//      WebDriverManager.edgedriver().setup();
//      WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

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

		Thread.sleep(5000);
		System.out.println("Taking screenshot...........");

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // captaured a screenshot

		File targetFile = new File("./screenshot/AMAZON.png");

		FileUtils.copyFile(screenshotFile, targetFile);

		driver.close();
	}

}
