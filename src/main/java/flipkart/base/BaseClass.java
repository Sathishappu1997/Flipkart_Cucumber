package flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void openBrowserAndNavigateUrl(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Pass the Proper Browser");
			throw new RuntimeException();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
