package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlansPage extends BasePage {

    public PlansPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/csr/plans']")
    WebElement plansTab;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> plansTable;
    @FindBy(xpath = "//tbody/tr/td[4]")
    public List<WebElement> dateCreatedColumn;
    @FindBy(xpath = "//tbody/tr/td[5]")
    public List<WebElement> dateExpireColumn;


    public void clickPlansTab() {
        click(plansTab);
    }

    public int getNumberOfPlansTableRow () {
       return getNumberOfTableRows(plansTable);
    }

}
