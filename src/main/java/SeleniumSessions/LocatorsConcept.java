package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();

		// 8 types of locators
		// 1. id
		// first we have to create webelement and then perform some action on that
		// webelement

		Thread.sleep(5000);

//		WebElement emailId=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		
//		emailId.sendKeys("sachinsharma263@gmail.com");
//		password.sendKeys("bholababa");
//		loginButton.click();

		// 2. name
		// WebElement name=driver.findElement(By.name("username"));

		// 3. classname
//		/form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-emai")).sendKeys("sachinsharma263@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("bholababa");

		// 4. xpath
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sachinsharma263@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("bholababa");

		// 5.cssselector
		driver.findElement(By.cssSelector("#username")).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("bholababa");

		// 6.linktext
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7.partial link text
		driver.findElement(By.partialLinkText("Sign")).click();

		//8.tagname
	}

}
