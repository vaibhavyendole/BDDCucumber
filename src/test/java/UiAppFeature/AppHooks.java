package UiAppFeature;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import Utility.PropReader;
import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	PropReader prop;
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		prop = new PropReader();
		String browserName = prop.ReadPropertyData("browser");
		
		driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
