package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	}

	@AfterTest
	public void closingApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
		System.out.println("closing app....");

	}

	@Test
	public void verifyDeleteFeature() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 60); // maximum time
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'right')]")));

		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		// rightButton.click();

		// create an object of action class
		Actions act = new Actions(driver);
		act.contextClick(rightButton).perform();

		WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		deleteButton.click();

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

	@Test
	public void verifyDoubleClickFeature() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 60); // maximum time
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Dou')]")));

		WebElement doubleButton = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		// rightButton.click();

		// create an object of action class
		Actions act = new Actions(driver);
		act.doubleClick(doubleButton).perform();

		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
