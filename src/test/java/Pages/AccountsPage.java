package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends BasePage{
    public AccountsPage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//a[@href='/csr/accounts']")
    private WebElement accountsTab;
    @FindBy (xpath = "//tbody/tr")
    private List<WebElement> accountsTable;
    @FindBy (xpath = "//div[3]/select")
    public WebElement showRowDropDown;


    public void clickAccountsTab () {
        click(accountsTab);
    }
    public int getNumberOfAccountsTable () {
        return getNumberOfTableRows(accountsTable);
    }

}
