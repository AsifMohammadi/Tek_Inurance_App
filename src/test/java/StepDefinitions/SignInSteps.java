package StepDefinitions;

import Pages.CustomerServicePortalPage;
import Pages.SignInPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SignInSteps extends SignInPage {

    @Given("clicking the login button")
    public void clicking_the_login_button() {
        clickLoginButton();
    }
    @When("entering username {string} and password {string}")
    public void entering_correct_username_and_password(String username, String password) {
        sendCredentials(username,password);
    }
    @When("clicking sign in button")
    public void clicking_signIn_button() {
        clickSignIn();
    }
    @When("clicking sign in button with wait")
    public void clickingSignInButtonWithWait() throws InterruptedException {
        clickSignIn();
        Thread.sleep(1000);
    }
    @Then("user should be directed to customer service portal page and the page header should be {string}")
    public void user_should_be_directed_to_customer_service_portal_page(String expectedText) {
        CustomerServicePortalPage customerServicePortalPage = new CustomerServicePortalPage();
        String actualText = customerServicePortalPage.getCustomerServicePageTitle();
        Assert.assertEquals("Validating successful user login",expectedText,actualText);
    }

}
