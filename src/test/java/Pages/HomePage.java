package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[1]/div/div[1]/div/h2")
    private WebElement txt_pageHeader;
    @FindBy (xpath = "//a[@class='chakra-button css-1jp0m7c']")
    private WebElement btn_createPrimaryAccount;

    public String getPageHeaderText () {
        return getElementText(txt_pageHeader);
    }
    public boolean isCreatePrimaryAccountButtonDisplayed () {
        return isElementDisplayed(btn_createPrimaryAccount);
    }
}
