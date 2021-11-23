package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("username"));// e1 waited
		driver.findElement(By.id("password"));// e2

		// nullify implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn"));//implict wait wont appied now

	}

}
