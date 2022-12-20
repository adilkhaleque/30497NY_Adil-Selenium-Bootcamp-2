package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ContactsPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Show Filters']")
    public WebElement showFiltersButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@href='/contacts/new']")
    public WebElement createNewContactsButton;

    public ContactsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnShowFiltersButton() {
        safeClickOnElement(showFiltersButton);
    }

    public void clickOnExportButton() {
        safeClickOnElement(exportButton);
    }

    public CreateNewContactPage clickOnCreateNewContactsPage() {
        safeClickOnElement(createNewContactsButton);

        return new CreateNewContactPage();
    }
}
