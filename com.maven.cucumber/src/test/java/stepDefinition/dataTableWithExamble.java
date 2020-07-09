package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataTableWithExamble {
	WebDriver driver;

	@Given("^Launch the Application In Local Evnironment$")
	public void launch_the_Application_In_Local_Evnironment() throws Throwable {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enterd the  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterd_the_and(String username, String password) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^Click the Returns Key$")
	public void click_the_Returns_Key() throws Throwable {
		driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("^User could see the Home page$")
	public void user_could_see_the_Home_page() throws Throwable {
		System.out.println("This is method is using  With Examples ");
	}

}
