package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CasesPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Show Filters']")
    public WebElement showFiltersButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@href='/cases/new']")
    public WebElement createNewCasesButton;

    public CasesPage() {
        PageFactory.initElements(driver, this);
    }

    public CreateNewCasePage clickOnCreateNewDealButton() {
        safeClickOnElement(createNewCasesButton);

        return new CreateNewCasePage();
    }
}
