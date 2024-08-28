package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\ScenarioOutlineBackground.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		
		
		)


public class ScenarioOutlineBackgroundRunner extends AbstractTestNGCucumberTests {
	

}
