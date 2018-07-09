package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basic_Auth {
    WebDriver driver;
    
	public Basic_Auth(WebDriver driver) {
	driver=this.driver;	
	}
	public void click() {
		driver.findElement(By.linkText("Basic Auth")).click();
		
    }
	

}
