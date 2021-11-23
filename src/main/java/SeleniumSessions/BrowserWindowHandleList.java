package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleList {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
		System.out.println(driver.getWindowHandle());
		
		

		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);

		for (int i = 0; i < handlesList.size(); i++) {
			System.out.println("Windows handles id are: " + handlesList.get(i));
		}

	}

}
