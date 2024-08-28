package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksCampainSteps {
	@Given("user should be on campain page")
	public void user_should_be_on_campain_page() {
	    System.out.println("This is my given statement for Campain");
	}

	@When("user click on create campain")
	public void user_click_on_create_campain() {
	    System.out.println("Creating Campain");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	 System.out.println("Entering information");
	}

	@Then("campaign should be created")
	public void campaign_should_be_created() {
	   System.out.println("Campain created");
	}

	@When("user click on delete button")
	public void user_click_on_delete_button() {
	  System.out.println("Click on delete button");
	}

	@Then("campain should get deleted")
	public void campain_should_get_deleted() {
	   System.out.println("campain deleted");
	}

}
