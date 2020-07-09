package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_Test_Definitions {

	WebDriver driver;

	@Given("^user is on Login page$")
	public void user_is_on_Login_page() {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Entered the \"(.*?)\" and \"(.*?)\"$")
	public void user_Entered_the_Username_and_Password(String username,String password) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^Clicks On the Login Button$")
	public void clicks_On_the_Login_Button() throws Throwable {

		driver.findElement(By.id("btnLogin")).submit();

	}

	@Then("^User Should navigate to Home Page$")
	public void user_Should_navigate_to_Home_Page() throws Throwable {

		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
