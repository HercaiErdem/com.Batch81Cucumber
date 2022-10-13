package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PracticeTestPage {

    public PracticeTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='button']")
    public WebElement clickButton;

    @FindBy(xpath = "//p[text()=' down 32']")
    public List<WebElement> down32;
    // //p[.=' down 32']
    // //*[.=' down 32']

    @FindBy(xpath = " //p[text()='click']")
    public List<WebElement> clickText;
    // //p[text()='click']
    // //p[.='click']
    //  //*[.='click']

}
