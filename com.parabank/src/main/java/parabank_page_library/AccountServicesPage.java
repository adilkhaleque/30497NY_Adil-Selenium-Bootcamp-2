package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountServicesPage extends BasePage {

    @FindBy(css = "#rightPanel p")
    public WebElement accountRegistrationMessageText;

    @FindBy(xpath = "//a[contains(text(), 'Open New Account')]")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[2]/a")
    public WebElement accountOverviewButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[3]/a")
    public WebElement transferFundsButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[4]/a")
    public WebElement billPayButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[5]/a")
    public WebElement findTransactionsButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[6]/a")
    public WebElement updateContactInfoButton;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[7]/a")
    public WebElement requestLoanButton;

    public AccountServicesPage() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountRegistrationMessage() {
        return getTrimmedElementText(accountRegistrationMessageText);
    }


    public OpenNewAccountPage clickOnOpenNewAccountButton() {
        safeClickOnElement(openNewAccountButton);

        return new OpenNewAccountPage();
    }

    public AccountOverviewPage clickOnAccountOverviewButton() {
        safeClickOnElement(accountOverviewButton);

        return new AccountOverviewPage();
    }

    public TransferFundsPage clickOnTransferFundsButton() {
        safeClickOnElement(transferFundsButton);

        return new TransferFundsPage();
    }

    public BillPayPage clickOnBillPayButton() {
        safeClickOnElement(billPayButton);

        return new BillPayPage();
    }

    public FindTransactionsPage clickOnFindTransactionButton() {
        safeClickOnElement(findTransactionsButton);

        return new FindTransactionsPage();
    }

    public UpdateContactInfoPage clickOnUpdateContactInfoButton() {
        safeClickOnElement(updateContactInfoButton);

        return new UpdateContactInfoPage();
    }

    public RequestLoanPage clickOnRequestLoanButton() {
        safeClickOnElement(requestLoanButton);

        return new RequestLoanPage();
    }

}
