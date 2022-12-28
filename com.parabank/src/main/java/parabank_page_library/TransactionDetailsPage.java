package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionDetailsPage extends BasePage {

    @FindBy(xpath = "//div[@id='rightPanel']/table/tbody/tr[1]/td[1]/b")
    public WebElement transactionIdText;

    public String getTransactionIdTextName() {
        return getTrimmedElementText(transactionIdText);
    }

    public TransactionDetailsPage() {
        PageFactory.initElements(driver,this);
    }

}
