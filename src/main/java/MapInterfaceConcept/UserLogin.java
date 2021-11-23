package MapInterfaceConcept;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException {

		Map<String, String> userLogin = new HashMap<String, String>();
		userLogin.put("admin", "admin_test@123");
		userLogin.put("patient", "roger_test@1234");
		userLogin.put("doctor", "jyoti_test@12345");

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/signup");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();

//		driver.findElement(By.id("username")).sendKeys(userLogin.get("patient").split("_")[0]);
//		driver.findElement(By.id("password")).sendKeys(userLogin.get("patient").split("_")[1]);

		userLogin(driver, getMap(), "patient");

	}

	public static Map<String, String> getMap() {
		Map<String, String> userLogin = new HashMap<String, String>();
		userLogin.put("admin", "admin_test@123");
		userLogin.put("patient", "roger_test@1234");
		userLogin.put("doctor", "jyoti_test@12345");

		return userLogin;
	}

	public static void userLogin(WebDriver driver, Map<String, String> userLogin, String user) {

		driver.findElement(By.id("username")).sendKeys(userLogin.get("patient").split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userLogin.get("patient").split("_")[1]);

	}

}
