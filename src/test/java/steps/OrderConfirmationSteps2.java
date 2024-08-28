package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps2 {
	AddingProductSteps2 addingProduct2;
	
	public OrderConfirmationSteps2(AddingProductSteps2 aps2)  // This is Constructor 
	{
		addingProduct2	= aps2;
	}
	
	@When("I click on place order2")
	public void i_click_on_place_order2() {
		  System.out.println("placing order2");
	}

	@Then("Order should get placed2")
	public void order_should_get_placed2() {
		String productIdValue = addingProduct2.getProductID2();
		System.out.println("Order placed and product id is2 "+productIdValue);

		
}
}
