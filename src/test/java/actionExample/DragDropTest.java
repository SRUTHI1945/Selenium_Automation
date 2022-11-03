package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropTest extends BaseTest {

	@Test
	public void test1() throws Exception {

		// handle frame

		WebElement myFrame = driver
				.findElement(By.xpath("//iframe[@data-src=\"../../demoSite/practice/droppable/photo-manager.html\"]"));
		driver.switchTo().frame(myFrame);

		WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash = driver.findElement(By.cssSelector("#trash"));

		Actions act = new Actions(driver);

		// Method1
		act.dragAndDrop(img3, trash).perform();

		// A convenience method that performs click-and-hold at the location of the
		// source element,
		// moves to the location of the target element, then releases the mouse.

		// Method2
		act.clickAndHold(img4).moveToElement(trash).release().perform();

	}

}
