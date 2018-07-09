package Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Valid_Credential {
   WebDriver driver;
	public Valid_Credential(WebDriver driver) {
	   driver=this.driver;
   }
	public void Enter_valid_credential() {
		System.out.println("krishna");
		 Alert alert = driver.switchTo().alert();
		 driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("admin");
		driver.switchTo().alert().sendKeys("admin");
		driver.switchTo().alert().accept();
	}
}
