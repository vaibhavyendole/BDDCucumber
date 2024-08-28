package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableUsingMapsSteps {
	@Given("Maps User is at the account page")
	public void Maps_user_is_at_the_account_page() {
	   System.out.println("Given Statement");
	}

	@When("Maps user enters the following data")
	public void Maps_user_enters_the_following_data(DataTable VardataTable) {
		
		// Using List
		List<List<String>> CompleteData = VardataTable.asLists(); // Gives Complete Data
		String StringUserEmail = CompleteData.get(1).get(2); //ShortCut
		System.out.println("UserEmail is "+StringUserEmail);
		
		List<String> First_Row = CompleteData.get(0); //get the value of complete First Row
		String FirstName = First_Row.get(0);//get the 1st field value of 1st Row
		System.out.println("Name is "+FirstName);
		System.out.println("***********************Above Output Using List**********************");
		System.out.println("***********************Below Output Using Maps**********************");
		
		//Using Maps
		List<Map<String, String>> MapCompleteData = VardataTable.asMaps(); // Gives Complete Data
		Map<String, String> MapZerothList = MapCompleteData.get(0); // Gives First Row 
		String PhoneNumber = MapZerothList.get("Phone");
		System.out.println(PhoneNumber);
		
		Map<String, String> MapFirstList = MapCompleteData.get(1);
		String MapEnv = MapFirstList.get("Env");
		System.out.println("This my Env "+MapEnv);
		System.out.println("*************Below O/P Itering List******************");
		//Using Iterating List
		
		List<String> FirstRowIndexList = CompleteData.get(1);
		for(String AllValue:FirstRowIndexList)
		{
			System.out.println(AllValue);
		}
		System.out.println("*************Normal For Loop******************");
		//Normal For Loop
		for(int i = 0; i<FirstRowIndexList.size(); i++)
		{
			String Value1st = FirstRowIndexList.get(i);
			System.out.println(Value1st);
		}
	}

	@When("Maps user click on submit button")
	public void Maps_user_click_on_submit_button() {
	    System.out.println("Cicked on Submit");
	}
	@Then("Maps user should get confirmation message")
	public void Maps_user_should_get_confirmation_message() {
		System.out.println("user created");
	}

}
