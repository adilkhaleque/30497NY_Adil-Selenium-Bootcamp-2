package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOverviewPage extends BasePage {

    @FindBy(css = "#leftPanel p")
    public WebElement accountNameHeader;

    @FindBy(xpath = "//*[@id='accountTable']/tbody/tr[1]/td[1]/a")
    public WebElement accountLink;

    @FindBy(xpath = "//table[@id='accountTable']//th[2]")
    public WebElement balanceHeading;

    public AccountOverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public String getLoggedInAs() {
        return getTrimmedElementText(accountNameHeader);
    }

    public String getBalanceHeadingText() {
        return getTrimmedElementText(balanceHeading);
    }

    public AccountDetailsAndActivityPage clickOnAccount() {
        safeClickOnElement(accountLink);

        return new AccountDetailsAndActivityPage();

    }


}
