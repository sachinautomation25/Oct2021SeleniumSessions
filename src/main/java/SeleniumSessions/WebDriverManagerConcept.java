package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriver driver = null;
		// chrome
//		WebDriverManager.chromedriver().setup();
//		
//		 driver = new ChromeDriver();
//		
//		driver.get("http://www.google.com");
//		
//		System.out.println(driver.getTitle());

		// firefox
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());
		
		//safari
//		WebDriverManager.getInstance(SafariDriver.class).setup();
//
//		new SafariDriver();
	}

}
