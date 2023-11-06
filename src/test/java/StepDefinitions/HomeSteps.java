package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeSteps extends HomePage {
    @Then("{string} should be visible")
    public void pageHeaderValidation (String expectedText) {
        String actualText = getPageHeaderText();
        Assert.assertEquals("Validating homepage page header",expectedText,actualText);
    }
    @Then("create primary account should be displayed")
    public void createAccountButtonValidation() {
        boolean actualCondition = isCreatePrimaryAccountButtonDisplayed();
        Assert.assertTrue("Validating the create account button is displayed",actualCondition);
    }
}
