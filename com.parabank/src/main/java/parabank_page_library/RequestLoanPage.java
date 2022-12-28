package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestLoanPage extends BasePage {

    @FindBy(id = "amount")
    public WebElement loanAmountField;

    @FindBy(id = "downPayment")
    public WebElement downPaymentField;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountSelector;

    @FindBy(xpath = "//*[@id='fromAccountId']/option")
    public WebElement fromAccountOption;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/div/p[1]")
    public WebElement loanAprrovedMessage;

    public RequestLoanPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputLoanAmount(String loanAmount) {
        sendKeysToElement(loanAmountField, loanAmount);
    }

    public void inputDownPayment(String downPaymentAmount) {
        sendKeysToElement(downPaymentField, downPaymentAmount);
    }

    public void clickOnFromAccountSelector() {
        safeClickOnElement(fromAccountSelector);
    }

    public void clickOnApplyNowButton() {
        safeClickOnElement(applyNowButton);
    }

    public String getLoanApprovedMessageText() {
        return getTrimmedElementText(loanAprrovedMessage);
    }

    public void applyForLoan(String loanAmount, String downPaymentAmount) {
        inputLoanAmount(loanAmount);
        inputDownPayment(downPaymentAmount);
        clickOnApplyNowButton();
    }

}
