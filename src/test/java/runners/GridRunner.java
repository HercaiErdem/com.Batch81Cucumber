package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

public class GridRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            monochrome = true,
            plugin = {
                    "pretty",
                    "html:target/html-reports/cucumber.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-reports/cucumber.xml",
                    "rerun:target/failedRerun.txt"
            },
            features = "./src/test/resources/features",
            glue = {"stepdefinitions"},
            tags = "@google_search",
            dryRun = false

    )
    public class RunnerGrid {
    }














}
