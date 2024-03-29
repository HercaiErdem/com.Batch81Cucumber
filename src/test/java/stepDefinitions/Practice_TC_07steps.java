package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.*;
import pages.*;
import utilities.*;

import java.io.*;

public class Practice_TC_07steps {

    PracticeTC07Page practiceTC07Page = new PracticeTC07Page();
    private ReusableMethods ReuseableMethods;

    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals("home esit degil degil", homeUrl, Driver.getDriver().getCurrentUrl());
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        practiceTC07Page.testCaseLink.click();

    }

    @Then("Kullancinin test case sayfasina basariyla yonlendirildiğini dogrulayin")
    public void kullancininTestCaseSayfasinaBasariylaYonlendirildiğiniDogrulayin() {
        practiceTC07Page.testCaseLink.click();
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }

    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {
        try {
            ReuseableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
