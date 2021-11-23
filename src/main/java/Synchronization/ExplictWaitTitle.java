package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitTitle {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/signup");

		WebDriverWait wait = new WebDriverWait(driver, 1);
		// wait.until(ExpectedConditions.titleIs("Get started with HubSpot"));
		wait.until(ExpectedConditions.titleContains("Get"));
		System.out.println(driver.getTitle());
	}

	public static String GetTitle(WebDriver driver, String title) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));

		return driver.getTitle();
	}

}
