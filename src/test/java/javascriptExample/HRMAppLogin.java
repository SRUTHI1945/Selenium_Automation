package javascriptExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HRMAppLogin extends BaseTest {

	@Test
	public void verifySearchFeature() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));

		// driver.findElement(By.id("twotabsearchtextbox"));
		WebElement btnLogin = driver.findElement(By.tagName("button"));
		// WebElement pass =driver.findElement(By.name("password"));
		// btnLogin.click();

		// javascript

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		// JS.executeScript("alert('hello team, happy learning');");

		JS.executeScript("arguments[0].click();", btnLogin);

//      for (int i = 0; i < 10; i++) {
//          
//          JS.executeScript("arguments[0].setAttribute('style', arguments[1]);" ,     btnLogin,     "color: pink; border: 4px solid pink;");
//          JS.executeScript("arguments[0].setAttribute('style', arguments[1]);" ,     pass,     "color: green; border: 4px solid green;");
//      }

	}

}