package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage extends BasePage {

    @FindBy(id = "type")
    public WebElement accountTypeSelector;

//    @FindBy(xpath = "//select[@id='type']/option[1]")
//    public WebElement checkingAccount;
//
//    @FindBy(xpath = "//select[@id='type']/option[2]")
//    public WebElement savingsAccount;

    @FindBy(id = "fromAccountId")
    public WebElement chooseAccountSelector;

    @FindBy(xpath = "//select[@id='fromAccountId']/option")
    public WebElement existingAccount;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/form/div/input")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/p[1]")
    public WebElement accountOpenedMessage;

    public OpenNewAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAccountSelector() {
        safeClickOnElement(accountTypeSelector);
    }

    public void selectCheckingAccount(String accountTypeValue) {
        selectFromDropdownByValue(accountTypeSelector, accountTypeValue);
    }

    public void selectSavingsAccount(String accountTypeValue) {
        selectFromDropdownByValue(accountTypeSelector, accountTypeValue);
    }

    public void clickOnChooseAccountSelector() {
        safeClickOnElement(chooseAccountSelector);
    }

    public void clickOnExistingAccount() {
        safeClickOnElement(existingAccount);
    }

    public void clickOnOpenNewAccountButton() {
        safeClickOnElement(openNewAccountButton);
    }

    public String getAccountOpenedMessageText() {
        return getTrimmedElementText(accountOpenedMessage);
    }

    public void openCheckingAccount(String cValue) {
        clickOnAccountSelector();
        selectCheckingAccount(cValue);
        clickOnChooseAccountSelector();
        clickOnExistingAccount();
        clickOnOpenNewAccountButton();
    }

    public void openSavingsAccount(String sValue) {
        clickOnAccountSelector();
        selectSavingsAccount(sValue);
        clickOnChooseAccountSelector();
        clickOnExistingAccount();
        clickOnOpenNewAccountButton();
    }

}
