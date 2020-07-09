package stepDefinition;

import cucumber.api.java.en.Given;

public class expressionsStepDefinitions {
	
	@Given("^I have (\\d+) rupees$")
	public void I_have_rupees(int count) {
		
		System.out.println("I have "+count+" rupees");
	}
	@Given("^I got (\\d+\\.\\d+) CGPA$")
	public void I_got_CGPA(float num) {
		System.out.println("I got "+num+" CGPA");
	}
	
	@Given("^Iam is Yunger than \"(.*?)\" and elder than \"(.*?)\"$")
	public void Iam_is_Yunger_than_and_elder_than(String name, String name1) {
		
		System.out.println("Iam is Yunger than "+name+"  and elder than "+name1);
	}

}
