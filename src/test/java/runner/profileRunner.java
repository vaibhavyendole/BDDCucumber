package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AppFeature\\profile.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"}
		)


public class profileRunner extends AbstractTestNGCucumberTests{

}
