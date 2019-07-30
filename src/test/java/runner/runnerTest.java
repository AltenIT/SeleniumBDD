package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Cucumber/workflow.feature",
        glue = "StepsDefinition",
        tags= "@Scenario1",
        plugin={"html:target/cucumber-html-report"}
)

public class runnerTest { }