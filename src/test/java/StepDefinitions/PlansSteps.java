package StepDefinitions;

import Pages.PlansPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PlansSteps extends PlansPage {

    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy");

    @When("clicking the plans tab")
    public void clicking_the_plans_tab() throws InterruptedException {
        Thread.sleep(3000);
        clickPlansTab();
        Thread.sleep(3000);
    }
    @Then("{int} rows should be displayed")
    public void rows_should_be_displayed(int expectedRowNumber) {
        int actualRowNumber = getNumberOfPlansTableRow();
        Assert.assertEquals("Validating the plans table row",expectedRowNumber,actualRowNumber);
    }
    @Then("validate the create date is today")
    public void validate_the_create_date_is_tomorrow() {

        String todaySDateFormatted = simpleDateFormat.format(calendar.getTime());
       for (WebElement e: dateCreatedColumn) {
           Assert.assertEquals("Validating the date created",todaySDateFormatted,e.getText());
       }

    }
    @Then("the date expire is tomorrow")
    public void the_date_expire_is_the_day_after_tomorrow() {
        calendar.add(Calendar.DATE,1);
        String tomorrowSDateFormatted = simpleDateFormat.format(calendar.getTime());
        for (WebElement e: dateExpireColumn) {
            Assert.assertEquals("Validating the expire date",tomorrowSDateFormatted,e.getText());
        }

    }

}
