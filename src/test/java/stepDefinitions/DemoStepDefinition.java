package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoStepDefinition {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    DemoPage demo = new DemoPage();
    Actions action = new Actions(Driver.getDriver());

    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        demo.alertWE.click();

    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demo.clickMe.click();

    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        String allertYazisi = Driver.getDriver().switchTo().alert().getText();
        String expectedAllertYazisi = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedAllertYazisi, allertYazisi);

    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("kullanici Will enable bes seconds butonunun enable olmasini bekler")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.elementToBeClickable(demo.enable));

    }

    @And("kullanici Will enable bes seconds butonunun enable oldugunu test eder")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demo.enable.isEnabled());

    }
}
