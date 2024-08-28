package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductSteps {
	String productId;  // This is non static variable
	public String getProductID()
	{
		return productId;
	}
	
	@Given("I should be at product page")
	public void i_should_be_at_product_page() {
	    System.out.println("Given statement for Product page");
	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	  System.out.println("clicked on add to cart");
	}

	@Then("Product should get added")
	public void product_should_get_added() {
		System.out.println("Product added");
		// String productId = "abc1244"; --> This is Local variable; we cant access from other class
		//make this first global
		productId = "abc1244";
	}	
}
