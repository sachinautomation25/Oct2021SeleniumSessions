package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		WebElement contentMenu = driver.findElement(By.className("menulink"));

//		Actions a=new Actions(driver);
//		a.moveToElement(contentMenu).build().perform();
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.linkText("COURSES")).click();

		moveToElement(driver, contentMenu);
		driver.findElement(By.linkText("COURSES")).click();
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

}
