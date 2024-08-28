package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\HooksCampain.feature"},
		glue = {"steps", "Hooks"},   // Add the Name of Package where Hooks defined
		plugin = {"pretty"}
		
		
		)
public class HooksCampainRunner extends AbstractTestNGCucumberTests {

}
