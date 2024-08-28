package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AppFeature"},
		glue = {"steps"},
		plugin = {"pretty"},
		tags = "@campain or @login"
		)

public class tagsRunner extends AbstractTestNGCucumberTests {

}
