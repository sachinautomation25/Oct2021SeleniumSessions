package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Google")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
