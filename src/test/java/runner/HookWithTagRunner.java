package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\HooksWithTag.feature"},
		glue = {"steps", "Hooks"},
		plugin = {"pretty"},
		tags = "@campain5"
		
		)

public class HookWithTagRunner extends AbstractTestNGCucumberTests {

}
