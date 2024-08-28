package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataSteps {
	
	
	@Given("user should be at loginpage")
	public void user_should_be_at_loginpage() {
	   
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String uName) {
	 System.out.println("Entered Username is "+uName);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String Password) {
	    System.out.println("Entered Password is "+Password);
	}

	@When("user click on submit")
	public void user_click_on_submit() {
	    
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() {
	    
	}

}
