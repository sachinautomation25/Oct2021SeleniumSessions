
package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithAllAnnotation {

	WebDriver driver;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");
	By Signup = By.linkText("Sign Up Now");
	By homePage = By.xpath("//span[text()='Homepage']");

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("before method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trcrm.com/login/en");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(Signup).isDisplayed());

	}

	@Test(priority = 1, enabled = false)
	public void pageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3, enabled = false)
	public void loginTest() {
		driver.findElement(username).sendKeys("sachinsharma263@gmail.com");
		driver.findElement(password).sendKeys("Bholababa@1");
		driver.findElement(loginBtn).click();
		String homepage = driver.findElement(homePage).getText();
		Assert.assertEquals(homepage, "Homepage");

	}

	@AfterMethod
	public void tearDown() {

		System.out.println("after method");
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

}
