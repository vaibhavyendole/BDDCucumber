package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagsSteps {
	@Given("user should be at campaign page")
	public void user_should_be_at_campaign_page() {
	    System.out.println("On Campain Page");
	}

	@When("user clicks on create campaign")
	public void user_clicks_on_create_campaign() {
	   System.out.println("Clicked on Campain");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	    System.out.println("Campain Created");
	}

	@When("user click on edit campaign button")
	public void user_click_on_edit_campaign_button() {
	    System.out.println("Clied on campain button");
	}

	@When("user update the details")
	public void user_update_the_details() {
	    System.out.println("Update Details");
	}

	@Then("campaign should get updated")
	public void campaign_should_get_updated() {
	   System.out.println("Campain updated");
	}

	@Then("campaign should get deleted")
	public void campaign_should_get_deleted() {
	   System.out.println("Campain Deleted");
	}

}
