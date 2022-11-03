package testNGExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	@Test
	public void verifyLogin() throws Exception
	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("iphone 14");
		Thread.sleep(3000);
		driver.close();
}
}