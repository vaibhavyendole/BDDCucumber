package steps;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class DataTableRegistraionSteps {
	
	@Given("User is at the account page")
	public void user_is_at_the_account_page() {
	   System.out.println("Given Statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable VardataTable) {
		List<List<String>> CompleteData = VardataTable.asLists();
		String StringUserEmail = CompleteData.get(1).get(2); //ShortCut
		System.out.println("UserEmail is "+StringUserEmail);
		
		List<String> First_Row = CompleteData.get(0); //get the value of complete First Row
	String FirstName = First_Row.get(0);//get the 1st field value of 1st Row
		System.out.println("Name is "+FirstName);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    System.out.println("Cicked on Submit");
	}
	@Then("user should get confirmation message")
	public void user_should_get_confirmation_message() {
		System.out.println("user created");
	}

}
