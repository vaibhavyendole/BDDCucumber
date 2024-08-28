package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("I am at the login page")
	public void i_am_at_the_login_page() {
	    System.out.println("Reached on Login");
	}

	@When("I enter the credentials")
	public void i_enter_the_credentials() {
	    System.out.println("Entered Credential");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	   System.out.println("Clicked on Login");
	}

	@Then("I should be able to login")
	public void i_should_be_able_to_login() {
	    System.out.println("Reached on Home Page");
	}

	
}
