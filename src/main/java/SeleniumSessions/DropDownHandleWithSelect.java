package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?r=101");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select s1 = new Select(day);
		s1.selectByIndex(4);
		s1.selectByValue("6");
		s1.selectByVisibleText("7");

		System.out.println(s1.isMultiple());
		System.out.println(getAllOptions(driver, day));
		System.out.println(getAllOptions(driver, month));
		System.out.println(getAllOptions(driver, year));

//		List<WebElement> allOptions = s1.getOptions();
//		System.out.println("All options in Day dropdown are: " + allOptions.size());
//		for (int i = 0; i < allOptions.size(); i++) {
//			System.out.println(allOptions.get(i).getText());
//		}

//
//		Select s2 = new Select(month);
//		s2.selectByIndex(4);
//
//		Select s3 = new Select(year);
//		s3.selectByValue("2019");

//		By day = By.id("day");
//		By month = By.id("month");
//		By year = By.id("year");

//		doSelectByIndex(driver, day, 6);
//		doSelectByIndex(driver, month, 4);
//		doSelectByIndex(driver, year, 40);
//
//		doSelectByValue(driver, day, "4");
//		doSelectByValue(driver, month, "Jun");
//		doSelectByValue(driver, year, "2020");
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void doSelectByIndex(WebDriver driver, By locator, int index) {
		WebElement element = getElement(driver, locator);
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void doSelectByValue(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static ArrayList<String> getAllOptions(WebDriver driver, WebElement element) {
		Select s = new Select(element);
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> allOptionList = s.getOptions();
		System.out.println("Total options are:" + allOptionList.size());
		for (int i = 0; i < allOptionList.size(); i++) {
			// System.out.println(allOptionList.get(i).getText());
			ar.add(allOptionList.get(i).getText());
		}
		return ar;
	}
}
