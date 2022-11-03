package handleFrame;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleMultipleWindow_IRCTC extends BaseTest {

	@Test
	public void verifyDropdownMult() throws Exception {

		String parentWind = driver.getWindowHandle(); // single window
		System.out.println("parent Window: " + parentWind);

		Thread.sleep(5000);
		WebElement btn_OK = driver.findElement(By.xpath("//button[text()='OK']"));
		btn_OK.click();

		Thread.sleep(5000);

		WebElement lnkHotel = driver.findElement(By.linkText("HOTELS"));
		lnkHotel.click();

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("how many window present" + allWindow.size());

		String mainWindow = (String) allWindow.toArray()[0];
		String hotelWindow = (String) allWindow.toArray()[1];

		System.out.println("main Window: " + mainWindow);
		System.out.println("Hotel Window: " + hotelWindow);

		System.out.println("---------------------");
		Thread.sleep(4000);
		driver.switchTo().window(hotelWindow);

		driver.findElement(By.linkText("Login")).click();
//		Thread.sleep(4000);

		// switch back to main window
		driver.switchTo().window(mainWindow);
		driver.findElement(By.linkText("CONTACT US")).click();

		Thread.sleep(4000);
		driver.switchTo().window(hotelWindow); /// hotel window

	}

}
