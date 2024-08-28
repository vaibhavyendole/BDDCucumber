package drivermanager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver; 
	public WebDriver initBrowser(String browserName)   // Return type is not void it is WebDriver (Type of object)
	{
	
		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
