package handleSync;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleSyncIssue extends BaseTest {

	@Test
	public void verifyTextBox() throws InterruptedException {

		// Explicit Wait
		// conditionalWait

		WebDriverWait wait = new WebDriverWait(driver, 60); // maximum time
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));

		// Thread.sleep(10000); //hard coded delay
		driver.findElement(By.id("text3")).sendKeys("enter value.....");

	}

}