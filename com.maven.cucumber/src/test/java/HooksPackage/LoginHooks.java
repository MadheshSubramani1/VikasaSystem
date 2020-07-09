package HooksPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginHooks {

	@Before
	public static void beforeMethod() {

		System.out.println("Launch the Browser");

	}

	@After
	public static void AfterMethod() {

		System.out.println("Close the browser");

	}

}
