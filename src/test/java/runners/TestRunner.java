package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue="stepdefinitions", // Runner ve stepdefinition Java altında oldugu için isnümini yazmak yeterli
        dryRun = false,
        tags = "@amazon"

)



public class TestRunner {

}
