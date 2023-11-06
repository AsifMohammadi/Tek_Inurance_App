package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
    public SignInPage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "username")
    private WebElement input_username;
    @FindBy (name = "password")
    private WebElement input_pass;
    @FindBy (xpath = "//div/div[1]/div/a[2]")
    private WebElement btn_login;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement btn_signIn;

    public void clickLoginButton () {
        click(btn_login);
    }
    public void sendCredentials (String username,String password) {
        sendText(input_username,username);
        sendText(input_pass,password);
    }
    public void clickSignIn () {
        click(btn_signIn);
    }





}
