package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Markus on 18/02/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue={"stepDefinitions"},
        tags={"@tag"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        }

)

public class TestRunner {

}

