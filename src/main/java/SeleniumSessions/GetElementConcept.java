package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JSScriptExecutedBySe.JavaScriptUtil;

public class GetElementConcept {

	static JavaScriptUtil jsutil;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		jsutil	=new JavaScriptUtil(driver);

		driver.get("http://app.hubspot.com/signup");
		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(500);

		// By Locators
		By emaidId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUp = By.linkText("Sign up");

		// web elements
//		driver.findElement(emaidId).sendKeys("");
//		driver.findElement(password).sendKeys("");
//		driver.findElement(loginBtn).click();
//		driver.findElement(signUp).isDisplayed();

		doSendKeys(driver, emaidId, "sachinsharma263@gmail.com");
		doSendKeys(driver, password, "bholababa");
		doClick(driver, loginBtn);
		if (isElementDisplayed(driver, signUp))
			System.out.println(getText(driver, signUp));
		else
			System.out.println("Element is not visible " + signUp);

	}

	/**
	 * This method is used to create webelement on the basis of By locator
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {

		WebElement element = null;
		try {
			Thread.sleep(5000);
			element = driver.findElement(locator);
			jsutil.flash(element);;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some exception occured while finding element " + locator);
			e.printStackTrace();
		}

		return element;
	}

	/**
	 * This method is used to pass the values
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	/**
	 * This is used to click on an element
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	/**
	 * This is used to get text
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String getText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	/**
	 * This is used to check element is displayed
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean isElementDisplayed(WebDriver driver, By locator) {
		return getElement(driver, locator).isDisplayed();
	}

}
