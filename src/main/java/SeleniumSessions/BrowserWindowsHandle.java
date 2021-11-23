package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsHandle {

	public static void main(String[] args) {


		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		System.out.println("getWindowHandle"+driver.getWindowHandle());
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();
		System.out.println("getWindowHandle"+driver.getWindowHandle());
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String ParentWindowId=it.next();
		String childWindowId=it.next();
		
		System.out.println("Parent window Id: "+ParentWindowId);
		System.out.println("child window Id: "+ childWindowId);
		
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		System.out.println("getWindowHandle"+driver.getWindowHandle());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		System.out.println(driver.getTitle());
		
	}

}
