package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\PlaceOrder.feature"},
		glue = {"steps"},
		plugin = {"pretty"}	
		)
public class Order_Confirmation_Runner extends AbstractTestNGCucumberTests{}
