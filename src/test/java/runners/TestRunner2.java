package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

public class TestRunner2 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target\\cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"},
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@all",
            dryRun = false
    )
    public class Runner {

    }
}
