package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class DemoPage {
    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='btn btn-light '])[11]")
    public WebElement alertWE;

    @FindBy(xpath = "(//button[text()='Click me'])[2]")
    public WebElement clickMe;

    @FindBy (xpath = "//button[@id='enableAfter']")
    public WebElement enable;


}
