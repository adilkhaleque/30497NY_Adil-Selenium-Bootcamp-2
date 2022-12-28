package verizon_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class GamingPage extends SharedStepsUI {

    @FindBy(xpath = "//a[contains(text(), 'Gaming Headsets')]")
    public WebElement gamingHeadsetsLink;

    public GamingPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage clickOnGamingHeadsets() {
        jsScrollUntilElementIsVisible(gamingHeadsetsLink);
        safeClickOnElement(gamingHeadsetsLink);

        return new SearchResultsPage();
    }
}
