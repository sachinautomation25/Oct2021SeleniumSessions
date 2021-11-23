package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {

	WebDriver driver;

	By username = By.id("username");
	By password = By.id("password");
	By lgnBtn = By.id("loginBtn");
	By signup = By.linkText("Sign up");
	By signin = By.linkText("Sign in");
	By user = By.xpath("//span[text()='HCL']");

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/signup");
		driver.findElement(signin).click();

	}

	@Test
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}

	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();

		Assert.assertEquals(title, "HubSpot Login");
	}

	@Test
	public void doLoginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("Bholababa@1");
		driver.findElement(lgnBtn).click();
		Assert.assertEquals(driver.findElement(user).getText(), "HCL");
	}

}
