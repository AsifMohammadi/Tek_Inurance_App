package StepDefinitions;

import Pages.AccountsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AccountsSteps extends AccountsPage {
    @And("clicking the accounts tab")
    public void clickingTheAccountsTab () {
        clickAccountsTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Then("validate the default is {string}")
    public void validate_the_page_shows_five_rows_by_default(String expectedText) {
        Select select = new Select(showRowDropDown);
        WebElement selectedOption = select.getFirstSelectedOption();
        String actualText = selectedOption.getText();
        Assert.assertEquals("Validating the default dropdown selected",expectedText,actualText);

    }
    @When("selecting {string}")
    public void selecting(String dropDown) {
        Select select = new Select(showRowDropDown);
        select.selectByVisibleText(dropDown);
    }
    @Then("{int} rows should be visible")
    public void rows_should_be_visible(int expectedRowNo) {
        int actualRowNo = getNumberOfAccountsTable();
        Assert.assertEquals("Validating all dropdown options and their result",expectedRowNo,actualRowNo);
    }
}
