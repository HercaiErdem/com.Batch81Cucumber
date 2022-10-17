package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {
    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement createEmail;

    @FindBy (xpath = "//input[@id='id_gender2']")
    public WebElement radioButton;

    @FindBy (xpath = "(//*[text()='My account'])[1]")
    public WebElement myAccountText;


}
