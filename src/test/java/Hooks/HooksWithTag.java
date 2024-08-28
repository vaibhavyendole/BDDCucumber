package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksWithTag {
	@Before("@regression5")
	public void beforeHook5()
	{
		System.out.println("Before hook5 is executing");
	}
	
	@After("@sanity5")
	public void afterHook5() {
		System.out.println("After hook5 is executing");
	}
	
	@BeforeStep("@sanity5")
	public void beforeStep5()
	{
		System.out.println("Before step5 is executing");
	}
	
	@AfterStep
	public void adafterStep5()  // No Tags means applicable to all methods
	{
		
		System.out.println("After step is executing");
	}


}
