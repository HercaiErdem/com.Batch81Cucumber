package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

}
