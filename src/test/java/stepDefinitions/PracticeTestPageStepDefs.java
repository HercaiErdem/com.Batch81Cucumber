package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import pages.*;
import utilities.*;
import java.util.*;

public class PracticeTestPageStepDefs {
    PracticeTestPage obje = new PracticeTestPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32Toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int int1) {
        for (int i = 0; i < int1; i++) {
            obje.clickButton.click();

        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int int1) {
        for (int i = 0; i < int1; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        List<WebElement> down32 = obje.down32;

        for (WebElement w : down32) {
            down32Toplam += Integer.parseInt(w.getText().replaceAll
                    ("[^0-9]", "")); // ^ bu isaret degildir demek
        }
        System.out.println("down 32 toplam = " + down32Toplam);
    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
        List<WebElement> clickText = obje.clickText;
        for (WebElement w : clickText) {
            clickTextToplam += w.getText().length();
        }
        sonuc = down32Toplam- clickTextToplam;
        System.out.println("sonuc = " + sonuc);
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("sonuc esit degil",result,sonuc);

    }
}
