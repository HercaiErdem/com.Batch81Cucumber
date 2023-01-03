package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLogin;

}
