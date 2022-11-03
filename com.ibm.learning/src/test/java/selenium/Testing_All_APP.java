package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_All_APP {

	@Test
	public void Login() throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ramadurgam");
		driver.findElement(By.xpath("//input[@value='Bike']")).click();
		driver.findElement(By.xpath("//input[@value='Car']")).click();
		driver.findElement(By.xpath("//input[@value='Boat']")).click();
		driver.findElement(By.xpath("//input[@value='female']")).click();

//		driver.close();

	}
}
