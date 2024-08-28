package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\DataTableUsingMaps.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		
		
		)
public class DataTableMapRunner extends AbstractTestNGCucumberTests{

}
