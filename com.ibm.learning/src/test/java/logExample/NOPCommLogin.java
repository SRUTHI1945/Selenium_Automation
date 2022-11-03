package logExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest {

	@Test(priority = 1, description = "login with valid user credentails.")
	public void verifyLogin() {

		log.info("Clear text from userName field");
		driver.findElement(By.id("Email")).clear();
		log.info("enter username: " + conf.getadminUser());
		driver.findElement(By.id("Email")).sendKeys(conf.getadminUser());

		log.info("Clear text from password field");
		driver.findElement(By.id("Password")).clear();
		log.info("enter username: " + conf.getadminPass());
		driver.findElement(By.id("Password")).sendKeys(conf.getadminPass());

		log.info("click on Login Button");
		driver.findElement(By.tagName("button")).click();

	}

	@Test(priority = 2)
	public void verifyAppTitle() {
		log.info("Validation of Dahboard after successful login");
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}

	@Test(priority = 3)
	public void Logout() {
		log.info("Click on logout button.");
		driver.findElement(By.linkText("Logout")).click();

	}

}
