package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;
import io.cucumber.java.After;
public class Tests {

	@Before(order=2)
	public void Before() {
		System.out.println("Before");
	}
	
	@Before(order=1)
	public void Before2() {
		System.out.println("Before2");
	}
	@BeforeStep
	public void BeforeStep() {
		System.out.println("BeforeStep");
	}
	
	@Given("user in Tests page")
	public void userinTestspage() {
		System.out.println("Given");
	}
	@When("user enter data in search filed")
	public void userenterdatainsearchfiled() {
		System.out.println("When");
	}
	@Then("data should appear in search field")
	public void datashouldappearinsearchfield() {
		System.out.println("Then");
	}
	
	@AfterStep
	public void AfterStep() {
		System.out.println("AfterStep");
	}
	@After(order=2)
	public void After() {
		System.out.println("After");
	}
	
	@After(order=1)
	public void After2() {
		System.out.println("After-2");
	}

}
