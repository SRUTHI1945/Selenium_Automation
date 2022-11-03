package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown2 extends BaseTest {

	@Test
	public void verifyDropdownMult() throws Exception {

		WebElement list = driver.findElement(By.tagName("select"));

		Select sel = new Select(list);

		// access methods from select class
		System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());
		Assert.assertFalse(sel.isMultiple());

		// Select values from dropdown
		Thread.sleep(4000);
		sel.selectByIndex(1); // Saab
		Thread.sleep(4000);
		sel.selectByValue("Singapore"); // Opel

		Thread.sleep(4000);
		sel.selectByVisibleText("Toyota"); // Toyota

		Thread.sleep(4000);

	}

}
