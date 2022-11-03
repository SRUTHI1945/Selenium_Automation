package javascriptExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyntraExample extends BaseTest {

	@Test
	public void verifyReturnPolicy() {

		WebElement returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'30days')]"));

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView();", returnPolicy);

	}

}
