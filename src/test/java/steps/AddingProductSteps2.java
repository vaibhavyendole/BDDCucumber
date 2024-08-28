package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductSteps2 {
	static String productId2;  // we use static keyword for save value permanently to access in 
							// other scenario
	public String getProductID2()
	{
		return productId2;
	} 
	
	@Given("I should be at product page2")
	public void i_should_be_at_product_page2() {
		System.out.println("Given statement for Product page");
	}

	@When("I click on add to cart button2")
	public void i_click_on_add_to_cart_button2() {
		 System.out.println("clicked on add to cart");
	}

	@Then("Product should get added2")
	public void product_should_get_added2() {
		System.out.println("Product added");
		// String productId = "abc1244"; --> This is Local variable; we cant access from other class
		//make this first global
		productId2 = "abc1244";
	}

	@Then("page title should get contains {string}")
	public void page_title_should_get_contains(String VarPageTitle) {
	    System.out.println("page title is "+ VarPageTitle);
	    
	    System.out.println("productId from Title Scenario "+productId2);
	}
}
