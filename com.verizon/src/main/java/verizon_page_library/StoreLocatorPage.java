package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class StoreLocatorPage extends SharedStepsUI {

    @FindBy(id = "q")
    public WebElement zipCodeField;

    @FindBy(xpath = "//form[@id='search-form']//button[@class='search-button Locator-button Locator-button--search']")
    public WebElement searchButton;

    @FindBy(className = "ResultSummary-query")
    public WebElement locationResultsText;

    public StoreLocatorPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputZipCode(String zip) {
        clearSendKeysToElement(zipCodeField, zip);

    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public String getLocationResultsText() {
        return getTrimmedElementText(locationResultsText);
    }

}
