package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookWithTagsSteps {

	@Given("user should be at campaign page5")
	public void user_should_be_at_campaign_page5() {
	    System.out.println("User on Campain 5 Page");
	}

	@When("user clicks on create campaign5")
	public void user_clicks_on_create_campaign5() {
	   System.out.println("Clicked on Campain 5");
	}

	@When("user enters the information5")
	public void user_enters_the_information5() {
	    System.out.println("Entered Info Campan 5");
	}

	@Then("campaign should get created5")
	public void campaign_should_get_created5() {
	   System.out.println("Campain 5 Created");
	}

	@When("user click on edit campaign button5")
	public void user_click_on_edit_campaign_button5() {
	    System.out.println("Clicked on Edit 5");
	}

	@When("user update the details5")
	public void user_update_the_details5() {
	    System.out.println("Update the Detail 5");
	}

	@Then("campaign should get updated5")
	public void campaign_should_get_updated5() {
	   System.out.println("campain updated 5");
	}

	@When("user click on delete button5")
	public void user_click_on_delete_button5() {
	   
	}

	@Then("campaign should get deleted5")
	public void campaign_should_get_deleted5() {
	   
	}
	
}
