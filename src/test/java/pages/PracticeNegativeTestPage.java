package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;


public class PracticeNegativeTestPage {

    public PracticeNegativeTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signinSymbol;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[.='Sign in'])[4]")
    public WebElement signinWithCredentials;

    @FindBy(xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;

}
