package stepDefinitions;

import io.cucumber.java.en.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import pages.*;
import utilities.*;

public class BlueRentaCarStepDefinition {

    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys("gecersiz@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("123456").perform();

    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());

    }


}
