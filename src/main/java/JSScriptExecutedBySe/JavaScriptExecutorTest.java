package JSScriptExecutedBySe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		//jsutil.generateAlert("Hy welcome");

		//Thread.sleep(5000);
		//jsutil.clickElementByJS(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")));
		
//		jsutil.drawBorder(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")));
//		jsutil.refreshBrowserByJS();
		
//		Actions a=new Actions(driver);
//		a.click(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img"))).build().perform();
//		
//		System.out.println(jsutil.getBrowserInfo());
//		System.out.println(jsutil.getPageInnerText());
//
//		System.out.println(jsutil.getTitleByJS());
//		
//		jsutil.sendKeysUsingJSWithId("", "");
//		jsutil.sendKeysUsingJSWithName("", "");
//		jsutil.scrollPageDown();
		
		jsutil.scrollIntoView(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")));
		
		jsutil.flash(driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")));
	}

}
