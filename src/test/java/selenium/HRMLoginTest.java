package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginTest {

	@Test
	public void verifyLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\02415N744\\Desktop\\FULL STACK TRAINING\\Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.name("username"));
		Username.click();
		Username.sendKeys("Admin");
		System.out.println(Username.getTagName());
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
//		Thread.sleep(3000);
//		driver.close();
	}
}
