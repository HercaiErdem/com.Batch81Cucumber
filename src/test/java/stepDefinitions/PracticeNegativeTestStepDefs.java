package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.PracticeNegativeTestPage;
import utilities.ReusableMethods;

public class PracticeNegativeTestStepDefs {

    PracticeNegativeTestPage pntp = new PracticeNegativeTestPage();

    @When("login olmak icin signin e tiklar")
    public void login_olmak_icin_signin_e_tiklar() {
        ReusableMethods.waitForClickablility((WebElement) pntp.signinSymbol,5);
        pntp.signinSymbol.click();
        pntp.signinButton.click();

    }
    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
        username= Faker.instance().name().username();
        pntp.username.sendKeys(username);


    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password= Faker.instance().internet().password();
        pntp.password.sendKeys(password);

    }

    @And("signine tiklar")
    public void signineTiklar() {


    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {

    }

}
