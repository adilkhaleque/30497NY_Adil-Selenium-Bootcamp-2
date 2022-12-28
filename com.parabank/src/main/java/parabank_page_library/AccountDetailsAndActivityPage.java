package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsAndActivityPage extends BasePage {

    @FindBy(id = "accountType")
    public WebElement accountTypeName;

    @FindBy(xpath = "//table[@id='transactionTable']/tbody/tr[1]/td[2]/a")
    public WebElement transactionButton;

    public AccountDetailsAndActivityPage() {
        PageFactory.initElements(driver,this);
    }

    public String getAccountTypeNameText() {
        return getTrimmedElementText(accountTypeName);
    }

    public TransactionDetailsPage clickOnTransactionButton() {
        safeClickOnElement(transactionButton);

        return new TransactionDetailsPage();
    }
}
