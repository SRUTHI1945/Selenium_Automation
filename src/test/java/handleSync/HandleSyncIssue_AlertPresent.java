package handleSync;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleSyncIssue_AlertPresent extends BaseTest {

	@Test
	public void verifyTextBox() throws InterruptedException {

		// Explicit Wait
		// conditionalWait

		WebDriverWait wait = new WebDriverWait(driver, 60); // maximum time
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));
		wait.until(ExpectedConditions.alertIsPresent());

		// handle alert
		// validation
		String actualAlertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text:" + actualAlertText);
		Assert.assertTrue(actualAlertText.contains("submit query button!"));

		driver.switchTo().alert().accept();

	}

}
