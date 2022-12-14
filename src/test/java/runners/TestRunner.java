package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

public class TestRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target\\cucumber-reports2.html",
                    "json:target/json-reports/cucumber2.json",
                    "junit:target/xml-report/cucumber2.xml"},
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@gp1",
            dryRun = false
    )
    public class Runner {

    }


}

