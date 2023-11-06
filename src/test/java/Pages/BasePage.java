package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BasePage {

    public static WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    protected WebElement waitUntilVisibilityOfElement (WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected String getElementText (WebElement element) {

        return waitUntilVisibilityOfElement(element).getText();
    }
    protected boolean isElementDisplayed (WebElement element) {
        return waitUntilVisibilityOfElement(element).isDisplayed();
    }
    protected boolean isElementEnabled (WebElement element) {
        return waitUntilVisibilityOfElement(element).isEnabled();
    }
    protected void sendText (WebElement element , String text) {
        waitUntilVisibilityOfElement(element).sendKeys(text);
    }
    protected void click (WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    protected List<WebElement> getListOfElements (List<WebElement> element) {
       return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
    protected int getNumberOfTableRows(List<WebElement> elements) {
//        int number = 0;
//        for (WebElement e:plansTable) {
//            number++;
//        }
//        return number;
        return getListOfElements(elements).size();
    }
}
