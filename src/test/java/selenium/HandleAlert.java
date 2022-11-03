package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlert extends BaseTest {

	//@Test
    public void simpleAlert() throws Exception {
        
        Thread.sleep(4000);
      
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
        
        Thread.sleep(4000);
        
        //handle Alert
        //Alert/window/frame  -------- switchTo
        
        //accept
        //dismiss
        //getText
        //sendKeys
        
        
        Alert simpleAlert = driver.switchTo().alert();
        
        System.out.println(simpleAlert.getText());
        
        Assert.assertTrue(simpleAlert.getText().contains("alert message"));
        
        simpleAlert.dismiss();
        
    }
    
    @Test
    public void confirmAlert() throws Exception {
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
        
        Thread.sleep(4000);
        
        //handle Alert
        //Alert/window/frame  -------- switchTo
        
        //accept
        //dismiss
        //getText
        //sendKeys
        
        
        Alert confirmAlert = driver.switchTo().alert();
        
        System.out.println(confirmAlert.getText());
        
        Assert.assertTrue(confirmAlert.getText().contains("OK' or 'Cancel'"));
        
        confirmAlert.dismiss();
        
        Thread.sleep(4000);
        //validation step
        String cancellabel = driver.findElement(By.cssSelector("#demo")).getText();
        System.out.println(cancellabel);
        Assert.assertTrue(cancellabel.contains("Cancel"));
        
    }

}

