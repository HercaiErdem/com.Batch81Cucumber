package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement siginButton;

    @FindBy (xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;


    @FindBy(xpath = "//h4[text()='There was a problem']")
    public WebElement problemMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssitanceText;

    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;


}
