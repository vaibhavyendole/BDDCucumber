package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	@Given("user at the signup page")
	public void user_at_the_signup_page() {
	    System.out.println("on Login Page");
	}

	@When("user enter name as {string}")
	public void user_enter_name_as(String myName) {
		System.out.println("my Name is"+myName);
	   
	}

	@When("user select gender as {string}")
	public void user_select_gender_as(String Gender) {
	  System.out.println("Entered Gender is "+Gender);
	}

	@When("user select the slotnumber as {int}")
	public void user_select_the_slotnumber_as(Integer slotNuber) {
	    System.out.println("user slotNumber is "+slotNuber);
	}

	@When("user select the priority as true")
	public void user_select_the_priority_as_true() {
	    System.out.println(" Priority is true");
	}

	@When("user select the priority as false")
	public void user_select_the_priority_as_false() {
	    System.out.println("priority is false");
	}
}
