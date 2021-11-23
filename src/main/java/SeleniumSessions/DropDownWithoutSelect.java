package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?r=101");

		// select[@id='day']/option
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> yearList = driver.findElements(By.xpath("//select[@id='year']/option"));
		getAllOPtions(dayList);
		getAllOPtions(monthList);
		getAllOPtions(yearList);
	}

	public static void getAllOPtions(List<WebElement> optionList) {

		System.out.println("Total number of options are: " + optionList.size());
		for (int i = 0; i < optionList.size(); i++) {
			System.out.println(optionList.get(i).getText());
		}
	}

}
