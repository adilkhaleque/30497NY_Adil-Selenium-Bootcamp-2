package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPayPage extends BasePage {

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.name']")
    public WebElement payeeNameInputField;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.address.street']")
    public WebElement payeeStreetAddressInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.address.city']")
    public WebElement payeeCityInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.address.state']")
    public WebElement payeeStateInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.address.zipCode']")
    public WebElement payeeZipCodeInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.phoneNumber']")
    public WebElement payeePhoneNumberInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='payee.accountNumber']")
    public WebElement payeeAccountNumberInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='verifyAccount']")
    public WebElement verifyAccountInput;

    @FindBy(xpath = "//*[@id='rightPanel']//form[@class='ng-pristine ng-valid']//input[@name='amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement fromAccountSelector;

    @FindBy(xpath = "//select[@name='fromAccountId']/option[@value]")
    public WebElement fromAccountOption;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentButton;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div[2]/h1")
    public WebElement billPaymentCompleteTitle;

    public BillPayPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputPayeeName(String name) {
        sendKeysToElement(payeeNameInputField, name);
    }

    public void inputPayeeAddress(String address) {
        sendKeysToElement(payeeStreetAddressInput, address);
    }

    public void inputPayeeCity(String city) {
        sendKeysToElement(payeeCityInput, city);
    }

    public void inputPayeeState(String state) {
        sendKeysToElement(payeeStateInput, state);
    }

    public void inputPayeeZipCode(String zipCode) {
        sendKeysToElement(payeeZipCodeInput, zipCode);
    }

    public void inputPayeePhoneNumber(String phoneNumber) {
        sendKeysToElement(payeePhoneNumberInput, phoneNumber);
    }

    public void inputPayeeAccountNumber(String accountNumber) {
        sendKeysToElement(payeeAccountNumberInput, accountNumber);
    }

    public void inputVerifyAccountNumber(String verifyAccountNumber) {
        sendKeysToElement(verifyAccountInput, verifyAccountNumber);
    }

    public void inputAmount(String amount) {
        sendKeysToElement(amountInput, amount);
    }

    public void clickOnFromAccountSelector() {
        safeClickOnElement(fromAccountSelector);
    }

    public void clickOnSendPaymentButton() {
        safeClickOnElement(sendPaymentButton);
    }

    public String getBillPaymentCompleteTitle() {
        return getTrimmedElementText(billPaymentCompleteTitle);
    }

    public void enterPayeeInformation(String name, String address, String city, String state, String zipCode,
                                      String phoneNumber, String accountNumber, String verifyAccountNumber, String amount) {
        inputPayeeName(name);
        inputPayeeAddress(address);
        inputPayeeCity(city);
        inputPayeeState(state);
        inputPayeeZipCode(zipCode);
        inputPayeePhoneNumber(phoneNumber);
        inputPayeeAccountNumber(accountNumber);
        inputVerifyAccountNumber(verifyAccountNumber);
        inputAmount(amount);
    }

}
