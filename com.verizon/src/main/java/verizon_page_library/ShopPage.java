package verizon_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SharedStepsUI;

public class ShopPage extends SharedStepsUI {

    @FindBy(id = "google-btn")
    public WebElement googlePhoneButton;

    public ShopPage() {
        PageFactory.initElements(driver, this);
    }
    public SearchResultsPage clickOnGooglePhoneButton() {
        safeClickOnElement(googlePhoneButton);

        return new SearchResultsPage();
    }
}
