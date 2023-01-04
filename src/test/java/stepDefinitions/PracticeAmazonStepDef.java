package stepDefinitions;

import com.github.javafaker.*;
import io.cucumber.java.en.*;
import org.junit.*;
import pages.*;
import utilities.*;

public class PracticeAmazonStepDef {
    AmazonPage amazonPage = new AmazonPage();
    // Faker faker = new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        amazonPage.siginButton.click();
    }

    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        amazonPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
        amazonPage.continueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
        String expectedText = "There was a problem";
        String actualText = amazonPage.problemMessage.getText();
        Assert.assertEquals("Problem mesaji esit degildir", expectedText, actualText);

    }

    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
        amazonPage.needHelp.click();

    }

    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        amazonPage.forgotPasswordLink.click();

    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {
        ReusableMethods.getScreenshot("Fakemail", amazonPage.emailBox);

    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        Assert.assertTrue(amazonPage.passwordAssitanceText.isDisplayed());

    }

    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }

    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        amazonPage.createYourAccountButton.click();
    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue("Create Account Text içermiyor"
                ,amazonPage.createAccountText.getText().contains("Create account"));
    }

    @Then("websayfasini kapatir")
    public void websayfasini_kapatir() {
        Driver.quitDriver();

    }

}
