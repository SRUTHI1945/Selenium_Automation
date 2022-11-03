package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginWithValidDetails() {

		lp.enterEmail(conf.getadminUser());
		lp.enterpassword(conf.getadminPass());
		lp.clickCheckBox();
		lp.clickLogin();

	}

	@Test(priority = 2)
	public void verifyAppTitle() throws Exception {

		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");

	}

	@Test(priority = 3)
	public void verifyLogout() {

		lp.clickLogout();

	}
}