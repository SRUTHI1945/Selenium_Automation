package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Test_App {

	@Test
	public void Login() throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.name("RememberMe")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector(".button-1")).click();
		driver.findElement(By.className("button-1")).click();

		String actualTitle = "Dashboard";

		Assert.assertTrue(actualTitle.contains("Dashboard"));

		driver.findElement(By.linkText("Logout")).click();

		String actualTitle1 = "Login";

		Assert.assertTrue(actualTitle1.contains("Login"));

		driver.close();

	}

}
