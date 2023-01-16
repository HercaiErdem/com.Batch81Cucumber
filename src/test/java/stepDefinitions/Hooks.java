package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.*;
import utilities.*;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        //   Driver.closeDriver();
    }
}
