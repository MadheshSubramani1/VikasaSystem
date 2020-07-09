package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "featureFile",
                  glue = {"stepDefinition","HooksPackage"},
                  monochrome = true,
                  tags = {"@UsingBackground"}
                  )

public class RunnerClassForHooks {

}
