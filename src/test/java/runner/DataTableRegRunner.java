package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AppFeature\\DataTableRegistartion.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		
		)

public class DataTableRegRunner extends AbstractTestNGCucumberTests{

}
