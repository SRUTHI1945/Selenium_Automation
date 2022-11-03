package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationExample {

	@Test
	public void verifyLogin_XPATH() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
//		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input._3704LK")).sendKeys("iphone 14");

		Thread.sleep(1000);

		driver.navigate().to("https://www.google.com/");

		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();

	}

}
