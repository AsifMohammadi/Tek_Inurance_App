package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[@class='chakra-button css-1jp0m7c']")
    private WebElement btn_createPrimaryAccount;
    @FindBy (id = "email")
    private WebElement input_emailAddress;
    @FindBy (id = "firstName")
    private WebElement input_firstName;
    @FindBy (id = "gender")
    private WebElement input_gender;
    @FindBy (id = "title")
    private WebElement input_title;
    @FindBy (id = "lastName")
    private WebElement input_lastName;
    @FindBy (id = "maritalStatus")
    private WebElement input_maritalStatus;
    @FindBy (id = "dateOfBirth")
    private WebElement input_DOB;
    @FindBy (xpath = "//div/h2[3]")
    private WebElement enteredEmail;
    @FindBy (name = "username")
    private WebElement input_username;
    @FindBy (name = "password")
    private WebElement input_pass;
    @FindBy (name = "confirm")
    private WebElement input_confirmPass;
    @FindBy (xpath = "//button[@type=\"submit\"]")
    private WebElement btn_submit;
    @FindBy (xpath = "//div[2]/div/div/div/h2")
    private WebElement signInPageTitle;
    @FindBy (xpath = "//div[@role=\"alert\"]")
    private WebElement bnr_errorMessage;

    public void clickCreatePrimaryAccount () {
        click(btn_createPrimaryAccount);
    }
    public void sendEmailAddress (String emailAddress){
        sendText(input_emailAddress, emailAddress);
    }
    public void sendFirstName (String firstName) {
        sendText(input_firstName, firstName);
    }
    public void setGender (String gender) {
        Select select = new Select(input_gender);
        select.selectByVisibleText(gender);
    }
    public void setTitle (String title) {
        Select select = new Select(input_title);
        select.selectByVisibleText(title);
    }
    public void setMaritalStatus (String maritalStatus) {
        Select select = new Select(input_maritalStatus);
        select.selectByVisibleText(maritalStatus);
    }
    public void sendLastName (String lastName) {
        sendText(input_lastName, lastName);
    }
    public void sendDOB (String DOB) {
        sendText(input_DOB, DOB);
    }
    public String getEnteredEmailText () {
        return getElementText(enteredEmail);
    }
    public void createUsernameAndPass (String username, String pass) {
        sendText(input_username,username);
        sendText(input_pass,pass);
        sendText(input_confirmPass,pass);
    }
    public void clickSubmitOrCreateButton () {
        click(btn_submit);
    }
    public String getSignInPageTitle () {
        return getElementText(signInPageTitle);
    }
    public String getErrorMessageText () {
        return getElementText(bnr_errorMessage);
    }



}
