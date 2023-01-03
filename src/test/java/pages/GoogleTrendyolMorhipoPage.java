package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class GoogleTrendyolMorhipoPage {
    public GoogleTrendyolMorhipoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleAramaKutusu;

    @FindBy(xpath = "(//cite[text()='https://www.trendyol.com'])[1]")
    public WebElement trendyolLinki;

    @FindBy(xpath = "//input[@class='vQI670rJ']")
    public WebElement trendyolAramaKutusu;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement trendyolAramaSonucu;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement trendyolAramaSonucuYazisi;

    @FindBy(xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoAramaKutusu;

    @FindBy(xpath = "//span[@id='total-product-count']")
    public WebElement morhipoAramaSonucuSayisi;


}
