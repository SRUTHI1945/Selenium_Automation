package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Xpath_App {

	@Test
	public void Login() throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();		
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".button-1")).click();
		String actualTitle = "Dashboard";
		

		Assert.assertTrue(actualTitle.contains("Dashboard"));
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("Logout")).click();
	

		String actualTitle1 = "Login";

		Assert.assertTrue(actualTitle1.contains("Login"));

		driver.close();

	}
}
