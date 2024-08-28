package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\PlaceOrder2.feature"},
		glue = {"steps"},
		plugin = {"pretty"}	
		)
public class Order_Confirmation_Runner2 extends AbstractTestNGCucumberTests{}

