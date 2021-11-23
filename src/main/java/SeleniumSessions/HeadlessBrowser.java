package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String ar[])
	{
		WebDriver driver=null;
//		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
		
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		
		// driver=new ChromeDriver(co);
		driver=new FirefoxDriver(fo);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
