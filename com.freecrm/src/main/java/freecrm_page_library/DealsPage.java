package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class DealsPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui primary button' and text() = 'Pipeline']")
    public WebElement pipelineButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Show Filters']")
    public WebElement showFiltersButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Board']")
    public WebElement boardButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Manage Targets']")
    public WebElement manageTargetsButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@href='/deals/new']")
    public WebElement createNewDealsButton;

    public DealsPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewDealPage clickOnCreateNewDealButton() {
        safeClickOnElement(createNewDealsButton);

        return new CreateNewDealPage();
    }
}
