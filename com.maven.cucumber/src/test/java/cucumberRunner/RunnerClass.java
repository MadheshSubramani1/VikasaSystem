package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "featureFile/" , 
		glue = "stepDefinition",
		dryRun = true,
		//strict=true,
		monochrome=true,
		plugin= {"html:reports/htmlReports", "json:reports/jsonreport.json", "junit:reports/xmlReport.xml"},
		
		tags= {"@positiveScenario ,@NegatvieScenario "}//we can run scenario wise also
		//tags= {"~@VerifyTheSearchBar"}// Except this tags, Everthing will run
		//tags = {"@VerifyTheSearchBar,@VerifyTheLoginPage"}//any One Tag should be available
		//tags = {"@VerifyTheSearchBar","@VerifyTheLoginPage"}//Both tags Should be available in Feature File
		)
public class RunnerClass {

}
