package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SendTheValueWithOutHeaderDef {
	WebDriver driver;

	@Given("^Launch the Orange HRM Application$")
	public void launch_the_Orange_HRM_Application() throws Throwable {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter the below userName and Password$")
	public void enter_the_below_userName_and_Password(DataTable dataTable) throws Throwable {
		
		List<String> list=dataTable.asList(String.class);
		String UserName=list.get(0);
		String Password=list.get(1);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);

	}

	@When("^Enter the Login Button$")
	public void enter_the_Login_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("^User able to see the Home page$")
	public void user_able_to_see_the_Home_page() throws Throwable {
		System.out.println("This is method is using the WithOutHeader ");
	}

}
