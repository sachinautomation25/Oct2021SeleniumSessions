package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");// setting system property
		WebDriver driver = new ChromeDriver();// launch web browser

		driver.get("https://www.google.com");// get url
		
		String title = driver.getTitle();// get page title
		
		System.out.println("Page title is:" + title);

		// checkpoint:verification Automation+verification is Automation Testing

		if (title.equals("Google")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
