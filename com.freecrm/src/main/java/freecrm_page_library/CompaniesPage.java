package freecrm_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CompaniesPage extends SharedStepsUI {

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Show Filters']")
    public WebElement showFiltersButton;

    @FindBy(xpath = "//button[@class='ui linkedin button' and text() = 'Export']")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@href='/companies/new']")
    public WebElement createNewCompanyButton;

    public CompaniesPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnShowFiltersButton() {
        safeClickOnElement(showFiltersButton);
    }

    public void clickOnExportButton() {
        safeClickOnElement(exportButton);
    }

    public CreateNewCompanyPage clickOnCreateNewCompanyPage() {
        safeClickOnElement(createNewCompanyButton);

        return new CreateNewCompanyPage();
    }
}
