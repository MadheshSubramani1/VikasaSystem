package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackGroundExamble {
	
	@Given("^should complete the high school$")
	public void should_complete_the_high_school() throws Throwable {
	   System.out.println("should complete the high school");
	}

	@Given("^Should complete the higher secondary$")
	public void should_complete_the_higher_secondary() throws Throwable {
		 System.out.println("Should complete the higher secondary");
	}

	@Given("^stdeunt has to fill the Engineering Application$")
	public void stdeunt_has_to_fill_the_Engineering_Application() throws Throwable {
		 System.out.println("stdeunt has to fill the Engineering Application");
	}

	@When("^Apply to Engineering University$")
	public void apply_to_Engineering_University() throws Throwable {
		 System.out.println("Apply to Engineering University");
	}

	@Then("^Should Attend The Engineering counselling$")
	public void should_Attend_The_Engineering_counselling() throws Throwable {
		 System.out.println("Should Attend The Engineering counselling");
	}

	@Given("^stdeunt has to fill the Medical Application$")
	public void stdeunt_has_to_fill_the_Medical_Application() throws Throwable {
		 System.out.println("stdeunt has to fill the Medical Application");
	}

	@When("^Apply to Medical University$")
	public void apply_to_Medical_University() throws Throwable {
		 System.out.println("Apply to Medical University");
	}

	@Then("^Should Attend The Medical counselling$")
	public void should_Attend_The_Medical_counselling() throws Throwable {
		 System.out.println("Should Attend The Medical counselling");
	}

}
