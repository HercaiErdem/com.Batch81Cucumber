package stepDefinitions;

import com.github.javafaker.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import pages.*;
import utilities.*;
import java.time.*;

public class PracticeNegativeTestStepDefs {

    PracticeNegativeTestPage pntp = new PracticeNegativeTestPage();

    @When("login olmak icin signin e tiklar")
    public void login_olmak_icin_signin_e_tiklar() {
        ReusableMethods.waitForClickablility((WebElement) pntp.signinSymbol, 5);
        pntp.signinSymbol.click();
        pntp.signinButton.click();

    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
        username = Faker.instance().name().username();
        pntp.username.sendKeys(username);


    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password = Faker.instance().internet().password();
        pntp.password.sendKeys(password);

    }

    @And("signine tiklar")
    public void signineTiklar() {
        pntp.signinWithCredentials.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(pntp.popUpMessage));
        Assert.assertTrue(pntp.popUpMessage.isDisplayed());


        // popup message acilan mesaj demek ve bellli bir sure sonra kapanir
        // locate i; //*[contains(text(), 'Authentication information not correct.')]
        // mesaji alabilmek icin, onca lacate i konsol a yaz
        // sonra istedigi butonlari manuel olarak yap
    }

}
