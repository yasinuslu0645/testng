package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "email")
    public WebElement emailKutusu;

    @FindBy (id = "pass")
    public WebElement sifreKutusu;

    @FindBy (name = "login")
    public WebElement girisYap;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement isntConnected;
}
