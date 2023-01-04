package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.support.ui.*;
import pages.*;
import utilities.*;
import java.time.*;

public class DemoQAStepDefinition {
    DemoQAPage demoqa = new DemoQAPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @When("kullanici Visible After bes seconds butonunun gorunur olmasini bekler")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.visible));


    }

    @And("kullanici Visible After bes seconds butonunun gorunur oldugunu test eder")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(demoqa.visible.isDisplayed());


    }

}
