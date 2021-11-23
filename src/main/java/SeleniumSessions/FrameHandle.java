package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/");
		// driver.findElement(By.xpath("/html/body/h2/text()"));
		
		System.out.println("Total frame on webpage: "+driver.findElements(By.tagName("frame")).size());

		//frame(index)
//		driver.switchTo().frame(2);
//		String text = driver.findElement(By.cssSelector("body > h2")).getText();
//		System.out.println(text);
		
		//frme(nameorid)
//		driver.switchTo().frame("main");
//		String text = driver.findElement(By.cssSelector("body > h2")).getText();
//		System.out.println(text);
		
		//frame()
		WebElement frameElement=driver.findElement(By.name("main"));
		driver.switchTo().frame(frameElement);
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();
		
	}

}
