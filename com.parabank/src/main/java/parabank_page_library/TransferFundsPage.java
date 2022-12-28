package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage extends BasePage {

    @FindBy(id = "amount")
    public WebElement amountInputField;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountSelector;

    @FindBy(id = "toAccountId")
    public WebElement toAccountSelector;

    @FindBy(xpath = "//select[@id='fromAccountId']/option[1]")
    public WebElement fromFirstAccount;

    @FindBy(xpath = "//select[@id='toAccountId']/option[2]")
    public WebElement toSecondAccount;

    @FindBy(xpath = "//select[@id='toAccountId']/option[1]")
    public WebElement toFirstAccount;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/form/div[2]/input")
    public WebElement transferButton;

    @FindBy(xpath = "//h1[@class='title' and  text() = 'Transfer Complete!']")
    public WebElement transferCompleteTitle;

    public TransferFundsPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputTransferAmount(String amount) {
        sendKeysToElement(amountInputField, amount);
    }

    public void clickOnFromAccountSelector() {
        safeClickOnElement(fromAccountSelector);
    }

    public void selectFromFirstAccount(String fromAccountValue) {
        selectFromDropdownByValue(fromAccountSelector, fromAccountValue);
    }

    public void clickOnToAccountSelector() {
        safeClickOnElement(toAccountSelector);
    }

    public void selectToAccount(String toAccountValue) {
        selectFromDropdownByValue(toAccountSelector, toAccountValue);
    }

    public void clickOnTransferButton() {
        safeClickOnElement(transferButton);
    }

    public String getTransferCompleteTitleText() {
        return getTrimmedElementText(transferCompleteTitle);
    }

    public void doTransfer(String amount) {
        inputTransferAmount(amount);
        clickOnTransferButton();
    }

}
