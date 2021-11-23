package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http:www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> choiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
//		System.out.println(choiceList.size());
//		for (int i = 0; i < choiceList.size(); i++) {
//			String text=choiceList.get(i).getText();
//			System.out.println(text);
//			
//			if (text.equalsIgnoreCase("Choice 6 2")) {
//				choiceList.get(i).click();
//				
//			}
//		}
		selectChoice(driver, "choice 2", "choice 2 3", "choice 6", "choice 6 2 1", "choice 6 2");
	}

	public static void selectChoice(WebDriver driver,String... value) {
		List<WebElement> choiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		}

		// select all the values
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {

			}
		}

	}
}
