package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

import java.util.List;

public class GuruPage {
    public GuruPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> basliklar;
}
