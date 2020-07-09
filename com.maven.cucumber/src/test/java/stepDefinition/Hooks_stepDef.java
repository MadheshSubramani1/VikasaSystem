package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_stepDef {

	@Given("^Enter the Url$")
	public void this_is_First_Step() throws Throwable {

		System.out.println("Enter the Url");

	}

	@When("^Enter the Login Credentials$")
	public void this_is_Second_Step() throws Throwable {
		System.out.println("Enter the Login Credentials");
	}

	@Then("^Click The Login Button$")
	public void this_is_Third_Step() throws Throwable {
		System.out.println("Click The Login Button");
	}

}
