package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class openGoogleDefinitions {

	WebDriver driver;

	@Given("^user is entering the google\\.co\\.in$")
	public void user_is_entering_the_google_co_in() throws Throwable {
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@When("^select the search box$")
	public void select_the_search_box() throws Throwable {
		driver.findElement(By.name("q"));

	}

	@When("^Enters the search term as \"([^\"]*)\"$")
	public void enters_the_search_term_as(String value) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(value);

	}

	@When("^Enters the returns key$")
	public void enters_the_returns_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}

	@Then("^User able to see the search results$")
	public void user_able_to_see_the_search_results() throws Throwable {

		boolean status = driver.findElement(By.partialLinkText("salem")).isDisplayed();
		if (status) {
			System.out.println("Results displayed");
		} else {
			System.out.println("Results not displayed");
		}

	}

}
