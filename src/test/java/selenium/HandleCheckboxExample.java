package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCheckboxExample extends BaseTest {

	@Test
	

	public void Testcase1() throws Exception {
		
		System.out.println("Test Case1");
		
//		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ramadurgam");
	}
	

	@Test
	
	public void Testcase2() throws Exception {

		System.out.println("Test Case2");
		
		driver.findElement(By.xpath("//input[@value='Bike']")).click();
		driver.findElement(By.xpath("//input[@value='Car']")).click();

	}
}

