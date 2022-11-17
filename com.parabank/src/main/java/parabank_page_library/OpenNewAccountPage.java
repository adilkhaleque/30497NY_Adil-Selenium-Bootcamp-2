package parabank_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage extends BasePage {

    @FindBy(id = "type")
    public WebElement accountTypeSelector;

    @FindBy(xpath = "//select[@id='type']/option[1]")
    public WebElement checkingAccount;

    @FindBy(xpath = "//select[@id='type']/option[2]")
    public WebElement savingsAccount;

    @FindBy(id = "fromAccountId")
    public WebElement chooseAccountSelector;

    @FindBy(xpath = "//select[@id='fromAccountId']/option")
    public WebElement existingAccount;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/form/div/input")
    public WebElement openNewAccountButton;

    public OpenNewAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAccountSelector() {
        safeClickOnElement(accountTypeSelector);
    }

    public void clickOnChooseAccountSelector() {
        safeClickOnElement(chooseAccountSelector);
    }


}
