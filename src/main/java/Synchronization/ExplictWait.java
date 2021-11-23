package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {


		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();
		
		By username=By.id("username");
		By password=By.id("password");
		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(username)));
//		driver.findElement(password).sendKeys("dddddddddd");
		
		
		waitForPresenceOfElement(driver, username, 20);
		driver.findElement(password).sendKeys("dddddddddd");
		
	}
	public static void waitForPresenceOfElement(WebDriver driver,By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
