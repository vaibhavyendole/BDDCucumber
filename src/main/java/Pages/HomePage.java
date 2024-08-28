package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	// Following process is of Variable defining
	
	//WebElement for Cart
	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;   //Private - Using Encapsulation Principle
		
	//WebElement for Home Kitchen & Outdoor
	@FindBy(xpath = "//*[@alt='HnK']")
	private WebElement HKOsection;
	
	//WebElement for Home Kitchen & Outdoor --> Furniture (Cricket)
	@FindBy(xpath = "//div[@id='nav-subnav']/a[5]/span[1]")
	private WebElement Furniture; 	// Cricket
	
	private WebDriver driver;
	private WebDriverWait wait;   
	public HomePage(WebDriver driver)   // This constructor use for "Wait"
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this); // Use to Initialise driver so that We can use
	}
	
	public String fetchTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyCartIcon()
	{
		boolean isDisplayingCartIcon = cartIcon.isDisplayed();
		return isDisplayingCartIcon;
	}

	public void enteringHomeKitchenSection()
	{
		wait.until(ExpectedConditions.visibilityOf(HKOsection));
		HKOsection.click();
	}
	
	public boolean identifyFurniture()
	{
		wait.until(ExpectedConditions.visibilityOf(Furniture));
		 boolean isDisplayingFurniture = Furniture.isDisplayed();
		 return isDisplayingFurniture;
	}
	
	
}
