package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class WebPage {
    public WebPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[@class='section-title'])[2]")
    public WebElement login;
    @FindBy(xpath = "//*[@id='text']")
    public WebElement userName;


}
