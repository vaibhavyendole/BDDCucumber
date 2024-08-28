package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {
	AddingProductSteps addingProduct;
	public OrderConfirmationSteps(AddingProductSteps aps)  // This is Constructor 
	{
		addingProduct	= aps;
	}
	
	@When("I click on place order")
	public void i_click_on_place_order() {
	    System.out.println("placing order");
	}

	@Then("Order should get placed;")
	public void order_should_get_placed() {
		String productIdValue = addingProduct.getProductID();
		System.out.println("Order placed and product id is "+productIdValue);
}
}
