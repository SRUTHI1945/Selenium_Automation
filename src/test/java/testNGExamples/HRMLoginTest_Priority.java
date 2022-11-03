package testNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLoginTest_Priority {

	// Priority ------
	// highest negative number ---- highest priority
	// by default -----priority 0
	// if priority same -----default execution would be as per naming con ...ascii
	// value

	@BeforeTest
	public void launchApp() {

		System.out.println("launching ....");

	}

	@AfterTest
	public void closeApp() {

		System.out.println("closing app....");
	}

	@Test(priority = 0)
	public void verifyLogin() {

		System.out.println("verifyLogin test case.....");

	}

	@Test(priority = 3)
	public void verifyLogout() {

		System.out.println("verifyLogout test case.....");

	}

	@Test(priority = 1)
	public void verifyAddItems() {

		System.out.println("verifyAddItems test case.....");

	}

	@Test(priority = 2)
	public void verifyPayment() {

		System.out.println("verifyPayment test case.....");

	}

}
