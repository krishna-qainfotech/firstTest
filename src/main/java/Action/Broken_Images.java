package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Broken_Images {
	WebDriver driver;
	public Broken_Images(WebDriver driver) {
	    
		driver=this.driver;
	}
	public void click(){
		driver.findElement(By.linkText("Broken Images")).click();
	}
	public WebDriver getWebDriver() {
		return driver;
	}
	//public void 
}
