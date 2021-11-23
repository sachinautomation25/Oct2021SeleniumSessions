package SeleniumSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConept {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total link available in amazon.in " + linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			
			if (!text.isEmpty()) {
				System.out.println(i+"-->"+linkList.get(i).getText()+" URL-->"+ linkList.get(i).getAttribute("href"));
			}

		}

	}

}
