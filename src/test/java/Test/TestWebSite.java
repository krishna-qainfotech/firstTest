package Test;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Action.Basic_Auth;
import Action.Broken_Images;
import Action.Valid_Credential;

public class TestWebSite {
    WebDriver driver;
    Basic_Auth basic_auth;
    Valid_Credential valid_credential;
    Broken_Images broken_image;
	@BeforeTest
	public void Open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/chromedriver");

		driver = new ChromeDriver();
		driver.get("http://10.0.31.161:9292/");
		//driver.findElement(By.linkText("Basic Auth")).click();
		basic_auth = new Basic_Auth(driver);
		valid_credential =new Valid_Credential(driver);
		broken_image=new Broken_Images(driver); 
	}
	
	
//@Test
 // public void Click_On_Basic_Auth_() {
	//  basic_auth.click();
	//}

//@Test
//public void Enter_valid_credential() {
//	valid_credential.Enter_valid_credential();
//}
	
	@Test
	public void Click_On_Broken_Images_Link() {
		driver.findElement(By.linkText("Broken Images")).click();
		  driver.findElements(By.tagName("img")).size();
		//broken_image.click();
		//broken_image.getWebDriver();
	}
}
