package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendTheValuesWithHeaderDef {
	WebDriver driver;

	@Given("^Launch the Application In Test Evnironment$")
	public void launch_the_Application_In_Test_Evnironment() throws Throwable {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter the  userName and Password$")
	public void enter_the_userName_and_Password(DataTable dataTable) throws Throwable {

		List<Map<String, String>> keyValuepair = dataTable.asMaps(String.class, String.class);
		
		String username=keyValuepair.get(0).get("UserName");
		String password=keyValuepair.get(0).get("Password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^Click the Login Button$")
	public void click_the_Login_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("^User can see the Home page$")
	public void user_can_see_the_Home_page() throws Throwable {
		System.out.println("This is method is using the WithHeader ");
	}

}
