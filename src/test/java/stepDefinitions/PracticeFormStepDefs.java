package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDefs {

    PracticeFormPage obje = new PracticeFormPage();

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {
        username = Faker.instance().name().username();
        password = Faker.instance().internet().password();
        textarea = Faker.instance().animal().name();
        obje.username.sendKeys(username);
        obje.password.sendKeys(password);
        obje.textarea.clear();
        obje.textarea.sendKeys(textarea);

    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
       // obje.chooseFile.sendKeys("C:\\Users\\Kayra\\Desktop\\text.txt");
        String homeDirectory= System.getProperty("user.home");
        String filePath =homeDirectory+"/Desktop/text.txt";
        obje.chooseFile.sendKeys(filePath);

    }

    @And("checkbox_biri secer")
    public void checkbox_biriSecer() {
        if (!obje.checkBox1.isSelected()) {
            obje.checkBox1.click();

        }
        if (obje.checkBox2.isSelected()) {
            obje.checkBox2.click();

        }
        if (obje.checkBox3.isSelected()) {
            obje.checkBox3.click();

        }
    }


    @And("radio_ikiyi secer")
    public void radio_ikiyiSecer() {
        obje.radio2.click();
    }

    @And("selection item_ucu secer")
    public void selectionItem_ucuSecer() {
        obje.selectItem3.click();
    }

    @And("dropdown itmem_dortu secer")
    public void dropdownItmem_dortuSecer() {
        Select select = new Select(obje.dropdown);
        Random random = new Random();
        int rasgele = random.nextInt(select.getOptions().size() - 1);

        select.selectByIndex(rasgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        obje.submitButton.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(obje.fileName.isDisplayed());

    }

}
