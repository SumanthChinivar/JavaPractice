package webDriverMethods;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowPopUps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleWindow.html");
		
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		TreeMap<String,String> windowId=new TreeMap<>();
		Set<String> w = driver.getWindowHandles();
		System.out.println(w);
		
		for(String s:w) {
			driver.switchTo().window(s);
			String d = driver.getWindowHandle();
			windowId.put(driver.getTitle(), d);
		}
	}
}
