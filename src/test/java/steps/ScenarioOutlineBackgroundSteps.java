package steps;

import io.cucumber.java.en.Given;

public class ScenarioOutlineBackgroundSteps {
	
	@Given("I am at Home page")
	public void i_am_at_home_page() {
	  System.out.println("Home Page opened");
	}

}
