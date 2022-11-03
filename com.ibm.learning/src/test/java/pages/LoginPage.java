package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

//	public LoginPage(WebDriver driver) {
//
//		this.driver = driver;
//
//	}
	
	public LoginPage(WebDriver remotedriver) {
		
		driver = remotedriver;
	}

	// identification
	By txtEmail = By.id("Email");
	By txtPass = By.cssSelector("input#Password");
	By chkRememberMe = By.xpath("//input[@name='RememberMe']");
	By btnLogin = By.tagName("button");
	By btnLogout = By.linkText("Logout");

	// Actions/Methods
	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterpassword(String pwd) {

		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);

	}

	public void clickCheckBox() {

		driver.findElement(chkRememberMe).click();

	}

	public void clickOperationWithDelay(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		driver.findElement(locator).click();

	}

	public void clickLogout() {

		driver.findElement(btnLogout).click();

	}

	public void clickLogin() {

		driver.findElement(btnLogin).click();

	}

	public void verifyApplicationTitle(String expectedTitle) throws Exception {

		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

}
