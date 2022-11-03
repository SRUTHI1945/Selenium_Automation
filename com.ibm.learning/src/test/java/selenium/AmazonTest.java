package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import junit.framework.Assert;

public class AmazonTest {

	@Test
	public void verifySearchTest() throws Exception {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\02415N744\\Desktop\\FULL STACK TRAINING\\Softwares\\chromedriver_win32\\chromedriver.exe");
//		
//		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

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

		driver.close();
	}

}
