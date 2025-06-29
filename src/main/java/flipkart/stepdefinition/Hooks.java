package flipkart.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before
	public void checkBeforeHook() {
		System.out.println("Priting with Before Hook");
	}
	
	@After
	public void checkAfterHook() {
		System.out.println("Priting with After Hook");
	}
	
	@BeforeStep
	public void checkBeforeStepHook() {
		System.out.println("Priting with Before Step Hook");
	}
	
	@AfterStep
	public void checkAfterStepHook() {
		System.out.println("Priting with After Step Hook");
	}
	

}
