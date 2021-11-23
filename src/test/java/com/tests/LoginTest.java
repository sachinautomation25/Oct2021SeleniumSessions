package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	By username = By.id("_username");
	By password = By.id("_password");
	By loginBtn = By.xpath("//input[@type='submit']");
	By Signup = By.linkText("Sign Up Now");
	By homePage = By.xpath("//span[text()='Homepage']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser,String url ) throws Exception {
		System.out.println("before test");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {

			throw new Exception("NoSuchBrowserException");
		}
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(Signup).isDisplayed());

	}

	@Test(priority = 1)
	public void pageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM Login CRM | Customer Relationship Management TRCRM");
	}

	@Test(priority = 3)
	@Parameters({ "username", "password" })
	public void loginTest(String username2, String password2) {
		driver.findElement(username).sendKeys(username2);
		driver.findElement(password).sendKeys(password2);
		driver.findElement(loginBtn).click();
		String homepage = driver.findElement(homePage).getText();
		Assert.assertEquals(homepage, "Homepage");

	}

	@AfterTest
	public void tearDown() {

		System.out.println("after test");
		driver.quit();
	}
}
