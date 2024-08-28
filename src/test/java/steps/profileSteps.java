package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class profileSteps {

	@Given("I have logged into the application")
	public void i_have_logged_into_the_application() {
	    System.out.println("Logged into App");
	}

	@Given("I am at home page")
	public void i_am_at_home_page() {
	    System.out.println("Reached on Home Page");
	}

	@When("I click on add button")
	public void i_click_on_add_button() {
	    System.out.println("Clicked on Add button");
	}

	@When("I enter the data")
	public void i_enter_the_data() {
	    System.out.println("Entered TestData");
	}

	@Then("profile should get added")
	public void profile_should_get_added() {
	   System.out.println("Profile Added");
	}

	@When("I click on edit button")
	public void i_click_on_edit_button() {
	    System.out.println("Clicked on Edit");
	}

	@When("I update the details")
	public void i_update_the_details() {
	   System.out.println("Update the Details");
	}

	@Then("profile should get updated")
	public void profile_should_get_updated() {
	    System.out.println("Update The Profile");
	}

	@When("I click on delete button")
	public void i_click_on_delete_button() {
	 System.out.println("Clicked on Delete");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
	   System.out.println("Profile deleted");
	}

	
}
