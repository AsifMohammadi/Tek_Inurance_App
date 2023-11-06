package StepDefinitions;

import Pages.CreateAccountPage;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class CreateAccountSteps extends CreateAccountPage {

    int randomNo = (int)(Math.random()*1000000000);
    String emailAddress = "John"+randomNo+"@something.com";
    String username = "John"+randomNo;

    @Given("clicking the create primary account button")
    public void clicking_the_create_primary_account_button() {
        clickCreatePrimaryAccount();
    }
    @Given("filling out the necessary information")
    public void accountCreation()  {
        sendEmailAddress(emailAddress);
        setTitle("Mr.");
        sendFirstName("John");
        sendLastName("Doe");
        setGender("Male");
        setMaritalStatus("Single");
        sendDOB("12/21/1980");
    }
    @When("clicking the create account button")
    public void clickCreateAccountButton() {
       clickSubmitOrCreateButton();
    }
    @Then("the entered email address should be visible")
    public void the_entered_email_address_should_be_visible() {
        String actualText = getEnteredEmailText();
        Assert.assertEquals("Checking if the entered email is shown",emailAddress,actualText);
    }
    @When("creating username and password")
    public void creating_username_and_password() {
       createUsernameAndPass(username, "12345678");
    }
    @When("clicking submit")
    public void clicking_submit() {
        clickSubmitOrCreateButton();
    }
    @Then("user should be directed to sign in page")
    public void user_should_be_directed_to_sign_in_page() {
        String actualText = getSignInPageTitle();
        String expectedText = "Sign up your account";
        Assert.assertEquals("Validating successful creation of account",expectedText,actualText);
    }
    @Given("filling out the form and entering an existing email address")
    public void filling_out_the_form_and_entering_an_existing_email_address() {
        sendEmailAddress("john@something.com");
        setTitle("Mr.");
        sendFirstName("John");
        sendLastName("Doe");
        setGender("Male");
        setMaritalStatus("Single");
        sendDOB("12/21/1980");
    }
    @Then("the error message {string} should be shown")
    public void the_error_message_should_be_shown(String expectedText) {
        String actualText = getErrorMessageText();
        Assert.assertEquals("Validating the error message","ERROR\n"+expectedText,actualText);
    }
}
