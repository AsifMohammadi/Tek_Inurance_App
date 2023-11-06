package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePortalPage extends BasePage{
    public CustomerServicePortalPage (){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//h2")
    private WebElement customerServicePageTitle;
    @FindBy (xpath = "//button[@type='button']")
    private WebElement btn_user;
    @FindBy (xpath = "/html/body/div[1]/div/div[1]/div/button")
    private WebElement profileUserDrawer;
    @FindBy (xpath = "//button[@class='chakra-button css-1x18d5s']")
    private WebElement btn_logOut;
    @FindBy (xpath = "//div[2]/p[2]")
    private WebElement userType;
    @FindBy (xpath = "//div[3]/p[2]")
    private WebElement name;
    @FindBy (xpath = "//div[4]/p[2]")
    private WebElement userName;
    @FindBy (xpath = "//div[5]/ul/li")
    private WebElement authorities;


    public String getCustomerServicePageTitle (){
       return getElementText(customerServicePageTitle);
    }
    public boolean isLogOutButtonEnabled () {
        return isElementEnabled(btn_logOut);
    }
    public void clickUserDrawerMethod () {
        click(profileUserDrawer);
    }
    public void clickLogOutButton () {
        click(btn_logOut);
    }
    public String getUserTypeText () {
        return getElementText(userType);
    }
    public String getNameText () {
        return getElementText(name);
    }
    public String getUserNameText () {
        return getElementText(userName);
    }
    public String getAuthoritiesText () {
        return getElementText(authorities);
    }

}
