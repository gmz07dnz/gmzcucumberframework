package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports1.html",
                "json:target\\json-reports/cucumber1.json",
                "junit:target\\xml-report/cucumber1.xml" },
        features = "src/test/resources/features",
        glue="stepdefinitions", // Runner ve stepdefinition Java altında oldugu için isnümini yazmak yeterli
        dryRun = false
)
public class SmokeTestRunner {
}
