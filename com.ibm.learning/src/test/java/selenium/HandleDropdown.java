package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown extends BaseTest {

	@Test
	public void verifyDropdownMult() throws Exception {

		WebElement list = driver.findElement(By.cssSelector("[name='FromLB']"));

		Select sel = new Select(list);

		// access methods from select class
		System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());
		Assert.assertTrue(sel.isMultiple());

		// Select values from dropdown
		sel.selectByIndex(0); // USA

		sel.selectByValue("India"); // India

		sel.selectByVisibleText("Germany"); // Germany

		Thread.sleep(4000);

		sel.deselectAll();
		Thread.sleep(3000);
		sel.selectByValue("India");

		sel.selectByIndex(2); // Japan

		sel.selectByValue("Mexico"); // Mexico

		sel.selectByVisibleText("Germany"); // Germany

		System.out.println("Selection completed.....");
		Thread.sleep(3000);
		sel.deselectByIndex(2); // Japan
		sel.deselectByValue("Germany"); // Germany
		sel.deselectByVisibleText("Mexico"); // Mexico

		WebElement ele = sel.getWrappedElement();
		System.out.println("getWrappedElement: " + ele.getAttribute("value"));

	}

}
