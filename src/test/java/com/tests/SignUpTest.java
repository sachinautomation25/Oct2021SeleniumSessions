package com.tests;

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

public class SignUpTest {

	WebDriver driver;

	By SignUpNow = By.xpath("//a[text()='Sign Up Now']");
	By SignUpNowText = By.xpath("//h3[text()='Sign Up Now!']");

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) throws Exception {
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

	}

	@Test
	public void verifySignUpLinkTest() {
		driver.findElement(SignUpNow).click();
		Assert.assertEquals(driver.findElement(SignUpNowText).getText(), "Sign Up Now!");
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}
}
