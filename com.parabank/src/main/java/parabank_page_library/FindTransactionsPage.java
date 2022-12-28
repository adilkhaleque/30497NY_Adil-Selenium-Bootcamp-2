package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindTransactionsPage extends BasePage {

    @FindBy(id = "accountId")
    public WebElement accountSelector;

    @FindBy(xpath = "//select[@id='accountId']/option[@value]")
    public WebElement accountOption;

    @FindBy(id = "criteria.transactionId")
    public WebElement findByTransactionIdField;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div[3]/button")
    public WebElement transactionIdFindTransactionsButton;

    @FindBy(id = "criteria.onDate")
    public WebElement findByDateField;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div[5]/button")
    public WebElement dateFindTransactionsButton;

    @FindBy(id = "criteria.fromDate")
    public WebElement fromDateField;

    @FindBy(id = "criteria.toDate")
    public WebElement toDateField;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div[7]/button")
    public WebElement dateRangeFindTransactionsButton;

    @FindBy(id = "criteria.amount")
    public WebElement findByAmountField;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div[9]/button")
    public WebElement amountFindTransactionsButton;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/h1")
    public WebElement transactionResultsTitle;

    public void inputDate(String transactionDate) {
        sendKeysToElement(findByDateField, transactionDate);
    }

    public void clickOnDateFindTransactionsButton() {
        safeClickOnElement(dateFindTransactionsButton);
    }

    public void findTransactionsByDate(String transactionDate) {
        inputDate(transactionDate);
        clickOnDateFindTransactionsButton();
    }

    public String getTransactionResultsTitleText() {
        return getTrimmedElementText(transactionResultsTitle);
    }

}
