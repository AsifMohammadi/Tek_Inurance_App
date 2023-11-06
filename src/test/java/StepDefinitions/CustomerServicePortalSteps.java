package StepDefinitions;

import Pages.CustomerServicePortalPage;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class CustomerServicePortalSteps extends CustomerServicePortalPage {

    @When("clicking the user drawer")
    public void clickingUserDrawerStep () {
        clickUserDrawerMethod();
    }
    @Then("the logout button should be enabled")
    public void logOutButtonClickable()  {
        boolean actualCondition = isLogOutButtonEnabled();
        Assert.assertTrue("Checking if logout button is enabled",actualCondition);

    }
    @When("clicking the logout button")
    public void clicking_the_logout_button() {
        clickLogOutButton();
    }
    @Then("user type should be {string}")
    public void user_type_should_be(String expectedText) {
        String actualText = getUserTypeText();
        Assert.assertEquals("Validating the user type text", actualText,expectedText);
    }
    @Then("name should be {string}")
    public void name_should_be(String expectedText) {
        String actualText = getNameText();
        Assert.assertEquals("Validating the name text", actualText,expectedText);
    }
    @Then("Username should be {string}")
    public void username_should_be(String expectedText) {
        String actualText = getUserNameText();
        Assert.assertEquals("Validating the username text", actualText,expectedText);
    }
    @Then("Authorities should be {string}")
    public void authorities_should_be(String expectedText) {
        String actualText = getAuthoritiesText();
        Assert.assertEquals("Validating the authorities text", actualText,expectedText);
    }
}
