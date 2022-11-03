package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	@Test
	public void verifyLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\02415N744\\Desktop\\FULL STACK TRAINING\\Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("iphone 14");
		Thread.sleep(3000);
}
}